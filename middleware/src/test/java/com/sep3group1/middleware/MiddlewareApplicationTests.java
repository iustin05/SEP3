package com.sep3group1.middleware;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MiddlewareApplicationTests {
    @Test
    public void applicationContextLoaded() {
    }

    @Test
    public void applicationContextTest() {
        MiddlewareApplication.main(new String[] {});
    }
}
