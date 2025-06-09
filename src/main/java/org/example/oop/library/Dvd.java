package org.example.oop.library;

import java.util.Objects;

public class Dvd extends Item {
    private int length;

    public Dvd(String title, int year, int length) {
        super(title, year);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dvd dvd)) return false;
        return getLength() == dvd.getLength();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLength());
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "length=" + length +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    public void setLength(int length) {
        this.length = length;
    }
}
