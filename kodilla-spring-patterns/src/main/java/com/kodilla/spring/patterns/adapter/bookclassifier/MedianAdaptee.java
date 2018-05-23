package com.kodilla.spring.patterns.adapter.bookclassifier;

import java.util.Map;

import com.kodilla.spring.patterns.adapter.bookclassifier.libraryb.Book;
import com.kodilla.spring.patterns.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.spring.patterns.adapter.bookclassifier.libraryb.BookStatistics;
import com.kodilla.spring.patterns.adapter.bookclassifier.libraryb.Statistics;

public class MedianAdaptee implements BookStatistics {
	
	@Override
	public int averagePublicationYear(Map<BookSignature, Book> books) {
		Statistics statistics = new Statistics();
		return statistics.averagePublicationYear(books);
	}
	
	@Override
	public int medianPublicationYear(Map<BookSignature, Book> books) {
		Statistics statistics = new Statistics();
		return statistics.medianPublicationYear(books);
		}

}
