package com.kodilla.stream;
import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.forumuser.*;
import java.util.*;
import java.util.stream.Collectors;
import java.time.*;


public class StreamMain {
    public static void main(String[] args) {
//        BookDirectory bookDirectory = new BookDirectory();
//        Map<Integer, Book> theResultMapOfBooks = bookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication()>1995)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//System.out.println("no. of elements: "+theResultMapOfBooks.size());
//theResultMapOfBooks.entrySet().stream()
//        .map(entry -> entry.getKey() +": " + entry.getValue())
//        .forEach(System.out::println);
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 1995)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);
//
//        Forum forum = new Forum();
//        Map<Integer, ForumUser> resultMap = forum.getUserList().stream()
//                .filter(user -> user.getGender()=='M')
//                .filter(user -> user.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
//                .filter(user->user.getPostNumber()>0)
//                .collect(Collectors.toMap(ForumUser::getUserID, user->user));
//        resultMap.entrySet().stream().forEach(System.out::println);

        int[] numbers = {2, 4, 5, 6, 7, 8, 67, 54, 67, 89};
        double x= ArrayOperations.getAverage(numbers);
        System.out.println(x);

    }
}
