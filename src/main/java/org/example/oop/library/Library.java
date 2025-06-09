package org.example.oop.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Library {
    private ArrayList<Rent> rents;

    public Library() {
        rents = new ArrayList<>();
    }

    public boolean addRent(Rent toAdd){
        return rents.add(toAdd);
    }

    public boolean removeRent(Rent toRemove){
        return rents.remove(toRemove);
    }

    public ArrayList<Rent> getExpired(LocalDate now){
        ArrayList<Rent> expired = new ArrayList<>();
        for(Rent rent : rents){
            if(rent.isExpired(now)){
                expired.add(rent);
            }
        }
        return expired;
    }
}
