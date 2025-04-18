package com.example.camel.route;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;


public class SimpleRouteTests {

    @InjectMocks
    private SimpleRoute simpleRoute;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConfigure() {
        // GIVEN - Setup the context for the test
        // WHEN - Call the configure method under test
        simpleRoute.configure();
        // THEN - Assert that the log message is printed as expected
        verify(mock(org.apache.camel.CamelContext.class)).addRoutes(simpleRoute);
    }
}