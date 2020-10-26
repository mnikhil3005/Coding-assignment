package com.assignment.task.model;

/**
 * <code>BookingRequest</code> is ... <br>
 */
public class ExternalClientResponse {

    private Integer availableSpace;

    public ExternalClientResponse() {
    }

    public ExternalClientResponse(Integer availableSpace) {
        this.availableSpace = availableSpace;
    }

    /**
     * @return the availableSpace
     */
    public Integer getAvailableSpace() {
        return availableSpace;
    }

    /**
     * @param availableSpace the availableSpace to set
     */
    public void setAvailableSpace(Integer availableSpace) {
        this.availableSpace = availableSpace;
    }
}
