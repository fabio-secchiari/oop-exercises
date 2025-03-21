package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.ObjectStreamException;
import java.util.Objects;

@Getter @Setter @ToString
public class Patient {
    private String name;
    private int age;
    private double weight;

    public Patient(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Patient(String name, int age) {
        this(name, age, 65);
    }

    public Patient() {
        this("", 0, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Patient patient)) return false;
        return getAge() == patient.getAge()
                && Double.compare(getWeight(), patient.getWeight()) == 0
                && Objects.equals(getName(), patient.getName());
    }

}
