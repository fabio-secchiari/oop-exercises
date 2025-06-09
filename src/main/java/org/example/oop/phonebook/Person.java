package org.example.oop.phonebook;

import java.util.Objects;

public class Person {
    private String name;
    private String lastname;
    private String phone;

    public Person(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getLastname(), person.getLastname()) && Objects.equals(getPhone(), person.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastname(), getPhone());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
