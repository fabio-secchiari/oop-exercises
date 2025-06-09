package org.example.oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    private final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person toAdd) {
        if(phoneBook.contains(toAdd) || phoneBook.size() >= MAX_PERSONS) return false;
        return phoneBook.add(toAdd);
    }

    @Override
    public boolean removePerson(Person toRemove) {
        return phoneBook.remove(toRemove);
    }

    @Override
    public Person[] searchByLastname(String lastName) {
        ArrayList<Person> people = new ArrayList<>();
        for(Person person : phoneBook){
            if(person.getLastname().equals(lastName)){
                people.add(person);
            }
        }
        return people.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastName) {
        ArrayList<Person> people = new ArrayList<>();
        for(Person person : phoneBook){
            if(person.getLastname().equals(lastName) && person.getName().equals(name)){
                people.add(person);
            }
        }
        return people.toArray(new Person[]{});
    }
}
