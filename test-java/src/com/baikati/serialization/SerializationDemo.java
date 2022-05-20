package com.baikati.serialization;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var person = new Person();
        person.setSsn(101);
        person.setName("Cat");
        person.setDateOfBirth(LocalDate.of(2020, Month.APRIL, 30));

        var outputStream = new FileOutputStream("C://person.ser");
        var oos = new ObjectOutputStream(outputStream);
        oos.writeObject(person);

        var fis = new FileInputStream("C://person.ser");
        var ois = new ObjectInputStream(fis);
        var person1 = (Person) ois.readObject();

        System.out.println(person1.getSsn() + " " + person1.getName() + " " + person1.getDateOfBirth());
    }
}
