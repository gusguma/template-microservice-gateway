package com.gusguma.template.microservice.gateway.filters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PostTimeRequestFilterTest {

    @Test
    void testFilterType() {
        String filter = new PostTimeRequestFilter().filterType();
        assertNotNull(filter);
        assertEquals("post", filter);
    }

    @Test
    void testFilterOrder() {
        int filter = new PostTimeRequestFilter().filterOrder();
        assertEquals(1, filter);
    }

    @Test
    void testShouldFilter() {
        boolean filter = new PostTimeRequestFilter().shouldFilter();
        assertTrue(filter);
    }
}
