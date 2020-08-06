package com.gusguma.template.microservice.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class PreTimeRequestFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(PreTimeRequestFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        logger.info(String.format("%s Request routing to %s",request.getMethod(),request.getRequestURL().toString()));
        Long initialTime = System.currentTimeMillis();
        request.setAttribute("initialTime", initialTime);
        return null;
    }
}
