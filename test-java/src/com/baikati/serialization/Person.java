package com.baikati.serialization;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private int ssn;
    private String name;
    private transient LocalDate dateOfBirth;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
