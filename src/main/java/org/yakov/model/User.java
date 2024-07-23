package org.yakov.model;

import org.yakov.util.IdProvider;

public abstract class User {
    private final String id;

    public User(IdProvider idProvider) {
        this.id = idProvider.generateId();
    }

    public String getId() {
        return id;
    }
}
