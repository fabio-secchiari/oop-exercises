package org.example.oop.library;

import java.time.LocalDate;
import java.util.Objects;

public class Rent {
    private Item item;
    private Person person;
    private LocalDate begin;
    private LocalDate end;

    public Rent(Item item, Person person, LocalDate begin, LocalDate end) {
        this.item = item;
        this.person = person;
        this.begin = begin;
        this.end = end;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rent rent)) return false;
        return Objects.equals(getItem(), rent.getItem()) && Objects.equals(getPerson(), rent.getPerson()) && Objects.equals(getBegin(), rent.getBegin()) && Objects.equals(getEnd(), rent.getEnd());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItem(), getPerson(), getBegin(), getEnd());
    }

    @Override
    public String toString() {
        return "Rent{" +
                "item=" + item +
                ", person=" + person +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }

    boolean isExpired(LocalDate now){
        return now.isAfter(end);
    }
}
