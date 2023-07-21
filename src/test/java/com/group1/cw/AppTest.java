package com.group1.cw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void printNameTestNull()
    {
        app.printCountriesByPopulation(null);
    }

    @Test
    void printCountriesTestEmpty()
    {
        ArrayList<Country> country = new ArrayList<Country>();
        app.printCountriesByPopulation(country);
    }

    @Test
    void printCountriesTestContainsNull()
    {
        ArrayList<Country> country = new ArrayList<Country>();
        country.add(null);
        app.printCountriesByPopulation(country);
    }

    @Test
    void printCountries()
    {
        ArrayList<Country> country = new ArrayList<Country>();
        Country cou = new Country();
        cou.Code = "MMR";
        cou.Name = "Myanmar";
        cou.Continent = "Asia";
        cou.Region = "Southeast Asia";
        cou.Population = 885300;
        cou.Capital = "2711";
        country.add(cou);
        app.printCountriesByPopulation(country);
    }
}