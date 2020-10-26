package com.assignment.task.model;

import org.springframework.lang.NonNull;

import com.assignment.task.enums.ContainerType;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * <code>BookingRequest</code> is ... <br>
 */
public class BookingRequest {

  
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

    /**
     * @return the containerType
     */
    public ContainerType getContainerType() {
        return containerType;
    }

    /**
     * @param containerType the containerType to set
     */
    public void setContainerType(ContainerType containerType) {
        this.containerType = containerType;
    }

    /**
     * @return the containerSize
     */
    public Integer getContainerSize() {
        return containerSize;
    }

    /**
     * @param containerSize the containerSize to set
     */
    public void setContainerSize(Integer containerSize) {
        this.containerSize = containerSize;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
