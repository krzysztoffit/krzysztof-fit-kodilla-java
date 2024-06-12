package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import jdk.management.jfr.FlightRecorderMXBean;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library> {

    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book : books) {
            clonedLibrary.getBooks().add(book);
        }
        return clonedLibrary;
    }

    @Override
    public String toString() {
        String library = name + "\n";
        for (Book book : books) {
            library += book + "\n";
        }
        return library;
    }
}
