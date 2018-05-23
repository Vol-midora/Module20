package com.kodilla.spring.patterns.adapter.bookclassifier;

import com.kodilla.spring.patterns.adapter.bookclassifier.librarya.Book;
import com.kodilla.spring.patterns.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.spring.patterns.adapter.bookclassifier.libraryb.*;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
	
	public int publicationYearMedian(Set<Book> bookSet) {
		Map<BookSignature, com.kodilla.spring.patterns.adapter.bookclassifier.libraryb.Book> bookMap = new HashMap<>();
		for(Book book : bookSet) {
			bookMap.put(new BookSignature(book.getSignature()),
					new com.kodilla.spring.patterns.adapter.bookclassifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
		}
			
		return medianPublicationYear(bookMap);
	}
}
