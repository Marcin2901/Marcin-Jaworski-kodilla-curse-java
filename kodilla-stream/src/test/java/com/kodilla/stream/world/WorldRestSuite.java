package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldRestSuite {
    @Test
    public void testGetPeopleQuantiry(){
        //Given
        //CountryOfEuropa
        Country country1 = new Country("Polska", new BigDecimal("3600000"));
        Country country2 = new Country("Hiszpania", new BigDecimal("6000000"));
        //CountryOfAzja
        Country country3 = new Country("Rosja", new BigDecimal("102322493"));
        Country country4 = new Country("Chiny", new BigDecimal("500000000"));
        //CountryOfNAmerica
        Country country5 = new Country("New Yourk", new BigDecimal("1000000"));
        Country country6 = new Country("Hoolywod", new BigDecimal("12345678"));

        //Continents
        Continent Europa = new Continent("Europa");
        Continent Azja = new Continent("Azja");
        Continent Ameryka = new Continent("Ameryka");

        World world = new World();

       //Create relations for Countinents and Countries
        Europa.addCountries(country1);
        Europa.addCountries(country2);
        Azja.addCountries(country3);
        Azja.addCountries(country4);
        Ameryka.addCountries(country5);
        Ameryka.addCountries(country6);

        world.addContinent(Europa);
        world.addContinent(Azja);
        world.addContinent(Ameryka);

        //When
        BigDecimal expected =  world.getPeopleQuantity();

        //Then
        BigDecimal result = new BigDecimal("625268171");
        Assert.assertEquals(expected,result);

    }
}
