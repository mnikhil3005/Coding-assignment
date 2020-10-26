package com.assignment.task.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.task.model.ExternalClientResponse;
import com.assignment.task.service.TaskService;

/**
 * <code>TaskController</code> is ... <br>
 */

@RestController
public class MockController {

    // TODOs Add logger at request and getting response
    public static final Logger logger = LoggerFactory.getLogger(MockController.class);

    @Autowired
    private TaskService taskService;

    /**
     * 
     */
    @GetMapping(value = "/mock", produces = MediaType.APPLICATION_JSON_VALUE)
    public ExternalClientResponse mockAPI() {
        ExternalClientResponse externalClientResponse = new ExternalClientResponse(0);
        return externalClientResponse;
    }
}
