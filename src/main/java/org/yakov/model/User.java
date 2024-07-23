package org.yakov.model;

import org.yakov.util.IdProvider;

public abstract class User {
    private  String id;

    public User(){}
    public User(IdProvider idProvider) {
        this.id = idProvider.generateId();
    }

    public String getId() {
        return id;
    }
}
