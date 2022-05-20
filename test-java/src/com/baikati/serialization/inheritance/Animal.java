package com.baikati.serialization.inheritance;

import java.io.Serializable;

public class Animal implements Serializable {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
