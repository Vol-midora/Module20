package com.kodilla.spring.patterns.adapter.bookclassifier.librarya;

import java.util.Set;

public interface Classifier {
	int publicationYearMedian(Set<Book> bookSet);

}
