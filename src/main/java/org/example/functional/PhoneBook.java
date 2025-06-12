package org.example.functional;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Optional;

public class PhoneBook {
    @Getter @Setter @AllArgsConstructor
    @EqualsAndHashCode @ToString
    public static class Person {
        String name;
        String lastname;
        String phone;
    }
    private final List<Person> people;

    public PhoneBook(List<Person> people) {
        this.people = people;
    }

    public Optional<Person> searchByLastname(String lastname){
        return people.stream().filter(p -> p.getLastname().equals(lastname)).findFirst();
    }

    public Optional<Person> searchByNameAndLastname(String name, String lastname){
        return people.stream().filter(p -> p.getLastname().equals(lastname)
                && p.getName().equals(name)).findFirst();
    }
}
