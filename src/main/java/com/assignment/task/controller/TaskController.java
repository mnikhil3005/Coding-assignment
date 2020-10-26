package com.assignment.task.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.task.model.BookingReferenceResponse;
import com.assignment.task.model.BookingRequest;
import com.assignment.task.model.BookingResponse;
import com.assignment.task.service.TaskService;

/**
 * <code>TaskController</code> is ... <br>
 */

@RestController
public class TaskController {

    // TODOs Add logger at request and getting response
    public static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    private TaskService taskService;

    /**
     * 
     */
    @PostMapping(value = "/book/internal", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addBooking(@RequestBody BookingRequest bookingRequest) {
    	logger.info("Internal service");
        return getResponseEntity(taskService.addBooking());
    }
    
    @PostMapping(value = "/book/bookingDetails",produces = MediaType.APPLICATION_JSON_VALUE,
    		consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getBookingDetails(@RequestBody BookingRequest bookingRequest) {
    	logger.info("bookingDetails service");
        return getResponseEntity(taskService.getBookingDetails());
    }
    


    private <T extends Object> ResponseEntity<Object> getResponseEntity(T value) {
		
		return new ResponseEntity<Object>(value, HttpStatus.OK);
	}
}
