/**
 * 
 */
package com.assignment.task.model;

import java.security.Timestamp;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import com.assignment.task.enums.ContainerType;

/**
 * @author Smita
 *
 */
public class BookingReferenceResponse {
	
	private String bookingRef;

	public String getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(String bookingRef) {
		this.bookingRef = bookingRef;
	}
	
	
    
}
