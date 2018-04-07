package com.kodilla.stream.world;
import org.junit.*;
import java.util.*;
import java.math.*;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        ArrayList<Country> northAmericaCountries = new ArrayList<>();
        northAmericaCountries.add(new Country("Canada",new BigDecimal("56114523") ));
        northAmericaCountries.add(new Country("Mexico",new BigDecimal("43114523")) );
        northAmericaCountries.add(new Country("USA",new BigDecimal("143114523") ));
        ArrayList<Country> southAmericaCountries = new ArrayList<>();
        southAmericaCountries.add(new Country("Brasil", new BigDecimal("12332453632")));
        southAmericaCountries.add(new Country("Chile", new BigDecimal("123453632")));
        southAmericaCountries.add(new Country("Brasil", new BigDecimal("332453638")));
        ArrayList<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country("Russia", new BigDecimal("6345246564")));
        asiaCountries.add(new Country("China", new BigDecimal("1006345246564")));
        asiaCountries.add(new Country("India", new BigDecimal("1106345246564")));
        Continent asia = new Continent("Asia", asiaCountries);
        Continent northAmerica = new Continent("North America", northAmericaCountries);
        Continent southAmerica = new Continent("South America", southAmericaCountries);
        ArrayList<Continent> continents = new ArrayList<>();
        continents.add(asia);
        continents.add(northAmerica);
        continents.add(southAmerica);
        World world = new World(continents);

        //When
        BigDecimal test = world.getPeopleQuantity();

        //Then
        BigDecimal result = new BigDecimal("2132066444163");
        Assert.assertEquals(result, test);
    }
}
