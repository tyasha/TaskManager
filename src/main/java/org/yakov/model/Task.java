package org.yakov.model;

import org.yakov.util.IdProvider;

public abstract class Task {
    private String id;

    private String description;

    private User user;

    public Task(IdProvider idProvider, String description) {
        this.id = idProvider.generateId();
        this.description = description;
    }
}
