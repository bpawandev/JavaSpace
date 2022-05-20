package com.baikati.externalization;

import com.baikati.externalization.Person;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;

public class ExternalizationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var person = new Person();
        person.setSsn(101);
        person.setName("Bob");
        person.setDateOfBirth(LocalDate.of(2020, Month.APRIL, 30));

        var fileOutputStream = new FileOutputStream("C://person.ser");
        var outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(person);


        var fileInputStream = new FileInputStream("C://person.ser");
        var inputStream =  new ObjectInputStream(fileInputStream);
        Person person1 = (Person) inputStream.readObject();
        System.out.println(person1.getSsn()+" "+person1.getName()+" "+person1.getDateOfBirth());
    }
}
