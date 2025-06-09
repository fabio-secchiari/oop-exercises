package org.example.oop.library;

import java.util.Objects;

public class Book extends Item {
    private int pages;

    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return getPages() == book.getPages();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPages());
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
