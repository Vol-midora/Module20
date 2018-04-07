package com.kodilla.stream.book;
import java.util.ArrayList;
import java.util.List;

public class BookDirectory {
    private final List<Book> theBookList = new ArrayList<>();
    public BookDirectory() {
        theBookList.add(new Book("Dylan Murphy", "Wolf of the moun", 1991, 1));
        theBookList.add(new Book("Phoebe Pearson", "Slaves of drea", 1992, 2));
        theBookList.add(new Book("Morgan Walsh", "Obliteration of", 1334, 3));
        theBookList.add(new Book("Aimee Murphy", "Rejecting the ni", 1994, 4));
        theBookList.add(new Book("Ryan Talley", "Gangsters and kin", 1995, 5));
        theBookList.add(new Book("Madelynn Carson", "Unity without", 2000, 6));
        theBookList.add(new Book("Giancarlo Guerrero", "Enemies of", 2001, 7));
    }
    public List<Book> getList() {
        return new ArrayList<>(theBookList);
    }

}
