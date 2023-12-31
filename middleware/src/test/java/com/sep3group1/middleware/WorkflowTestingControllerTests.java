package com.sep3group1.middleware;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WorkflowTestingControllerTests {

    @Autowired
    WorkflowTestingController workflowTestingController;

    @Test
    void workflowTesting() {
        assertEquals("Working. Success.", workflowTestingController.workflowTesting());
    }

}