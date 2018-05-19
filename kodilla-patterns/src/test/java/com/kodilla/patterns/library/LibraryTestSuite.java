package com.kodilla.patterns.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("First Library");
        IntStream.iterate(1, n->n+1)
                .limit(10)
                .forEach(n->library.getBooks().add(new Book("Book no"+n, "John" + n, LocalDate.of(n, n,n))));

        //Creating shallow copy of the library
        Library shallowCopiedLibrary = null;
        try {
            shallowCopiedLibrary = library.shallowCopy();
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopiedLibrary = null;
        try {
            deepCopiedLibrary = library.deepCopy();
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        shallowCopiedLibrary.getBooks().add(new Book("1", "Dear Mason", LocalDate.of(1979, 12,21)));

        //Then
        Assert.assertEquals(11, library.getBooks().size());
        Assert.assertEquals(11, shallowCopiedLibrary.getBooks().size());
        Assert.assertEquals(10, deepCopiedLibrary.getBooks().size());

    }
}
