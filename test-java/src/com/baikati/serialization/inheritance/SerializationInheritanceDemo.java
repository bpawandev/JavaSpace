package com.baikati.serialization.inheritance;

import java.io.*;

public class SerializationInheritanceDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog();
        dog.setName("Jockey");
        dog.setType("German");

        FileOutputStream fileOutputStream = new FileOutputStream("C://animal.ser");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(dog);

        FileInputStream fileInputStream = new FileInputStream("C://animal.ser");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Dog dog1 = (Dog) inputStream.readObject();
        System.out.println(dog1.getName()+" "+dog1.getType());
    }
}
