package com.sep3group1.middleware;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MiddlewareApplicationTests {
    @Test
    void applicationContextLoaded() {
    }

    @Test
    void applicationContextTest() {
        MiddlewareApplication.main(new String[] {});
    }
}
