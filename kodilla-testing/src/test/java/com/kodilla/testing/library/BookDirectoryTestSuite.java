package com.kodilla.testing.library;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970+n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michig", 2001);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowi", 1994);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book>  theList = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theList.size());
    }
    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book>  theList25 = generateListOfNBooks(25);
        List<Book>  theList15 = generateListOfNBooks(15);
        List<Book>  theList0 = generateListOfNBooks(0);
        when(libraryDatabaseMock.listBooksWithCondition("xx25")).thenReturn(theList25);
        when(libraryDatabaseMock.listBooksWithCondition("xx15")).thenReturn(theList15);
        when(libraryDatabaseMock.listBooksWithCondition("xx0")).thenReturn(theList0);

        //When
        List<Book> resultList0 = bookLibrary.listBooksWithCondition("xx0");
        List<Book> resultList15 = bookLibrary.listBooksWithCondition("xx15");
        List<Book> resultList25 = bookLibrary.listBooksWithCondition("xx25");

        //Then
        assertEquals(0, resultList0.size());
        assertEquals(15, resultList15.size());
        assertEquals(0, resultList25.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);
// When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("a");
// Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }


    @Test
    public void testlistBooksInHandsOf0(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser testUser = new LibraryUser("Ryszard", "Swetru", "PESEL");
        List<Book> resultList0 = generateListOfNBooks(0);
        when(libraryDatabaseMock.listBooksInHandsOf(testUser)).thenReturn(resultList0);

        //When
        List<Book> testList = bookLibrary.listBooksInHandsOf(testUser);

        //Then
        assertEquals(0, testList.size());
    }
    @Test
    public void testlistBooksInHandsOf1(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser testUser = new LibraryUser("Ryszard", "Swetru", "PESEL");
        List<Book> resultList1 = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(testUser)).thenReturn(resultList1);

        //When
        List<Book> testList = bookLibrary.listBooksInHandsOf(testUser);

        //Then
        assertEquals(1, testList.size());
    }
    @Test
    public void testlistBooksInHandsOf5(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser testUser = new LibraryUser("Ryszard", "Swetru", "PESEL");
        List<Book> resultList5 = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(testUser)).thenReturn(resultList5);

        //When
        List<Book> testList = bookLibrary.listBooksInHandsOf(testUser);

        //Then
        assertEquals(5, testList.size());
    }
}
