package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBookWithConditionsReturnList() {
        // given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secret of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // when
        List<Book> theListOfBooks = bookLibrary.listBooksWithConditions("Secret");

        // then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBookWithConditionMoreThan20() {
        // given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        // when
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithConditions("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithConditions("AnyTitle");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithConditions("FortyBooks");

        // then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());

    }

    @Test
    void testListBookWithConditionFragmentShorterThan3() {
        // given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // when
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithConditions("An");

        // then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOfZeroBooks() {
        // given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "601208");
        List<Book> rentedBooks = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(new ArrayList<>());

        // when
        List<Book> bookList = bookLibrary.listBooksInHandsOf(libraryUser);

        // then
        assertEquals(0, bookList.size());
    }

    @Test
    void testListBooksInHandsOfOneBook() {
        // given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "601208");
        List<Book> rentedBooks = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(rentedBooks);

        // when
        List<Book> bookList = bookLibrary.listBooksInHandsOf(libraryUser);

        // then
        assertEquals(1, bookList.size());
    }

    @Test
    void testListBooksInHandsOfFiveBooks() {
        // given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "601208");
        List<Book> rentedBooks = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(rentedBooks);

        // when
        List<Book> bookList = bookLibrary.listBooksInHandsOf(libraryUser);

        // then
        assertEquals(5, bookList.size());
    }
}
