package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    Random random = new Random();

    @Test
    void testGetBook() {
        // given
        Library library = new Library("City Library");
        for (int i = 1; i <= 10; i++) {
            library.getBooks().add(new Book("Title" + i, "Author" + i,
                    LocalDate.of(
                            random.nextInt(1924, 2024),
                            random.nextInt(1, 12),
                            random.nextInt(1, 28))));
        }
        Book bookToRemove = new Book("Book to remove", "Author of the book to remove",
                LocalDate.of(2024, 6, 12));
        library.getBooks().add(bookToRemove);
        System.out.println(library);

        Library shalowClonedLibrary;
        try {
            shalowClonedLibrary = library.shallowCopy();
            shalowClonedLibrary.setName(library.getName() + " (shallow copy)");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(shalowClonedLibrary);

        Library deepClonedLibrary;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName(library.getName() + " (deep copy)");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(deepClonedLibrary);

        // when
        library.getBooks().remove(bookToRemove);

        System.out.println("*** AFTER REMOVE ONE BOOK ***");
        System.out.println(library);
        System.out.println(shalowClonedLibrary);
        System.out.println(deepClonedLibrary);

        // then
        assertEquals(10, library.getBooks().size());
        assertEquals(10, shalowClonedLibrary.getBooks().size());
        assertEquals(11, deepClonedLibrary.getBooks().size());
    }
}
