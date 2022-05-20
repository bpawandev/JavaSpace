package com.baikati.serialization.custom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    private String empId;
    private String empName;
    private transient LocalDate dateOfBirth;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
        LocalDate dob = this.dateOfBirth.plusMonths(2).plusDays(5);
        outputStream.writeObject(dob);

    }

    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        inputStream.defaultReadObject();
        LocalDate dob = (LocalDate) inputStream.readObject();
        this.dateOfBirth = dob.minusMonths(2).minusDays(5);


    }

}
