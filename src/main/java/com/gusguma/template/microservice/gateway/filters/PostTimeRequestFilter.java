package com.gusguma.template.microservice.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class PostTimeRequestFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(PostTimeRequestFilter.class);

    @Override
    public String filterType() {
        return "post";
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
        logger.info("Post Filter");
        Long initialTime = (Long) request.getAttribute("initialTime");
        Long finalTime = System.currentTimeMillis();
        Long requestTime = finalTime - initialTime;
        logger.info(String.format("Request total time in seconds %s seconds",requestTime.doubleValue()/1000.00));
        logger.info(String.format("Request total time in miliseconds %s miliseconds",requestTime));
        return null;
    }
}
