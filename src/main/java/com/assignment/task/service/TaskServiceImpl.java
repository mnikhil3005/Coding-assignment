package com.assignment.task.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.task.model.BookingReferenceResponse;
import com.assignment.task.model.BookingResponse;
import com.assignment.task.model.ExternalClientResponse;

@Service
public class TaskServiceImpl implements TaskService {

    private static final Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);
    @Autowired
    private ExternalServiceClient externalServiceClient;

    /**
     * 
     */
    @Override
    public BookingResponse addBooking() {

        BookingResponse bookingResponse = new BookingResponse();
        ExternalClientResponse externalClientResponse = externalServiceClient.getAvailableSpace();
        
        if (externalClientResponse != null) {
            
            if (externalClientResponse.getAvailableSpace() > 0) {
                bookingResponse.setAvailable(Boolean.TRUE);
            } else {
                bookingResponse.setAvailable(Boolean.FALSE);
            }
        } else {
            logger.info("Unable to get response from external service.");
        }
        
        return bookingResponse;
    }
    
    
    @Override
    public BookingReferenceResponse getBookingDetails() {
    	BookingReferenceResponse BookingReferenceResponse = new BookingReferenceResponse();
    	return BookingReferenceResponse;
    }

}
