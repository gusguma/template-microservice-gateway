package com.gusguma.template.microservice.gateway.filters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PreTimeRequestFilterTest {

    @Test
    void testFilterType() {
        String filter = new PreTimeRequestFilter().filterType();
        assertNotNull(filter);
        assertEquals("pre", filter);
    }

    @Test
    void testFilterOrder() {
        int filter = new PreTimeRequestFilter().filterOrder();
        assertEquals(1, filter);
    }

    @Test
    void testShouldFilter() {
        boolean filter = new PreTimeRequestFilter().shouldFilter();
        assertTrue(filter);
    }
}
