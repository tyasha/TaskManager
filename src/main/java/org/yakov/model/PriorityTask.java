package org.yakov.model;

import org.yakov.util.IdProvider;


public class PriorityTask extends Task{

    private Priority priority;

    public PriorityTask(IdProvider idProvider, String description, Priority priority) {
        super(idProvider, description);
        this.priority = priority;
    }
}
