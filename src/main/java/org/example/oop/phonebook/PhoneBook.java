package org.example.oop.phonebook;

public interface PhoneBook {
    int MAX_PERSONS = 256;
    boolean addPerson(Person toAdd);
    boolean removePerson(Person toRemove);
    Person[] searchByLastname(String lastName);
    Person[] searchByNameAndLastname(String name, String lastName);
}
