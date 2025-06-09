package org.example.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook {
    private final Person[] phoneBook;

    public PhoneBookArray() {
        this.phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person toAdd) {
        for(Person person : phoneBook){
            if(person != null && person.equals(toAdd)) return false;
        }

        for(int i=0; i<MAX_PERSONS; i++){
            if(phoneBook[i] == null) {
                phoneBook[i] = toAdd;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person toRemove) {
        for(int i=0; i<MAX_PERSONS; i++){
            if(phoneBook[i] != null && phoneBook[i].equals(toRemove)){
                phoneBook[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastName) {
        Person[] people = new Person[MAX_PERSONS];
        int crs = 0;
        for(Person person : phoneBook){
            if(person != null && person.getLastname().equals(lastName)){
                people[crs++] = person;
            }
        }
        // sennò gli passerei una variabile locale
        return Arrays.copyOf(people, crs);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastName) {
        Person[] people = new Person[MAX_PERSONS];
        int crs = 0;
        for(Person person : phoneBook){
            if(person != null && person.getLastname().equals(lastName) && person.getName().equals(name)){
                people[crs++] = person;
            }
        }
        return Arrays.copyOf(people, crs);
    }
}
