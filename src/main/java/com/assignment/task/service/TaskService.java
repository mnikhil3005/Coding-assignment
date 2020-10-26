package com.assignment.task.service;

import org.springframework.stereotype.Service;

import com.assignment.task.model.BookingReferenceResponse;
import com.assignment.task.model.BookingResponse;

/**
 * <code>TaskService</code> is ... <br>
 */
@Service
public interface TaskService {

    /**
     *
     * @return Return
     */
    public BookingResponse addBooking();
    
    public BookingReferenceResponse getBookingDetails();

}
