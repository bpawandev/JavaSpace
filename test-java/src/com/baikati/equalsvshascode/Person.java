package com.baikati.equalsvshascode;

import java.util.Objects;

public class Person {
    private int ssn;
    private String firstName;
    private String lastName;
    private int age;

    public Person(int ssn, String firstName, String lastName, int age) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ssn == person.ssn && age == person.age
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn, firstName, lastName, age);
    }
}
