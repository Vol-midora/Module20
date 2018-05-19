package com.kodilla.stream.world;
import java.util.*;

public final class Continent {
    private final String name;
    private final List<Country> countryList;

    public Continent(String name, ArrayList<Country> countries) {
        this.name = name;
        this.countryList = countries;

    }

    public String getName() {
        return name;
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}
