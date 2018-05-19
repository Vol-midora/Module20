package com.kodilla.good.patterns;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieMap = movieStore.getMovies();

        String allTitles = movieMap.entrySet().stream()
                .flatMap(n->n.getValue().stream())
                .collect(Collectors.joining("!", "", ""));

        System.out.println(allTitles);
    }
}
