package org.example.oop.library;

import java.util.Objects;

public class Person {
    private String id;
    private String name;
    private String lastname;

    public Person(String id, String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getLastname(), person.getLastname()) && Objects.equals(getId(), person.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastname(), getId());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
