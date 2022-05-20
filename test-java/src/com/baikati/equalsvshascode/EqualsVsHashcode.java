package com.baikati.equalsvshascode;

import java.util.HashMap;

public class EqualsVsHashcode {
    public static void main(String[] args) {
       Person person1 = new Person(101,"Pawan","Kumar",18);
       Person person2 = new Person(102,"Bob","John",20);

        System.out.println("person1.equals(person2) isTrue : "+ person1.equals(person2));
        System.out.println("person2.equals(person1) isTrue : " + person2.equals(person1));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
