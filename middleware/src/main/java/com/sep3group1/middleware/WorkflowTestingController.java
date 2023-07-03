package com.sep3group1.middleware;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class WorkflowTestingController {
        @GetMapping(value = "/workflowTesting")
        public String workflowTesting() {
            return "Working. Success.";
        }
}
