package com.baikati.serialization.custom;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;

public class CustomSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee();
        employee.setEmpId("1001");
        employee.setEmpName("John");
        employee.setDateOfBirth(LocalDate.of(2020, Month.APRIL, 30));
        System.out.println("Before Serialization");
        System.out.println(employee.getEmpId()+" "+employee.getEmpName()+" "+employee.getDateOfBirth());
        FileOutputStream fileOutputStream = new FileOutputStream("D://employee.ser");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(employee);


        FileInputStream fileInputStream = new FileInputStream("D://coreJava//test-java//src//com//baikati//serialization//person.ser");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Employee employee1 = (Employee) inputStream.readObject();
        System.out.println("After Deserialization");
        System.out.println(employee1.getEmpId()+" "+employee1.getEmpName()+" "+employee1.getDateOfBirth());

    }
}
