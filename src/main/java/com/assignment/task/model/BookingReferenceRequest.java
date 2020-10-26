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
 * 
 *
 */
public class BookingReferenceRequest {

	private ContainerType containerType;
    private Integer containerSize;
    
    @Valid
    @NonNull
    @Size(min=5,max=20)
    private String origin;
    
    @Valid
    @NonNull
    @Size(min=5,max=20)
    private String destination;
    
    @Valid
    @NonNull
    @Size(min=1,max=100)
    private Integer quantity;
    
    private Timestamp timestamp;

	public ContainerType getContainerType() {
		return containerType;
	}

	public void setContainerType(ContainerType containerType) {
		this.containerType = containerType;
	}

	public Integer getContainerSize() {
		return containerSize;
	}

	public void setContainerSize(Integer containerSize) {
		this.containerSize = containerSize;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
    
    
}
