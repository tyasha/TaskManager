package org.yakov.model;

import org.yakov.util.IdProvider;

public abstract class Task {
    private final String id;

    public Task(IdProvider idProvider) {
        this.id = idProvider.generateId();
    }

    public String getId() {
        return id;
    }
}
