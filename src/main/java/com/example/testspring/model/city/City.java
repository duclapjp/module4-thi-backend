package com.example.testspring.model.city;
import com.example.testspring.model.country.Country;

import javax.persistence.*;

import java.sql.Date;

@Entity
@Table(name="city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double are;
    private int population;
    private int gdp;
    private String description;
    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;
    public City() {
    }

    public City(String name, double are, int population, int gdp, String description, Country country) {
        this.name = name;
        this.are = are;
        this.population = population;
        this.gdp = gdp;
        this.description = description;
        this.country = country;
    }

    public City(Long id, String name, double are, int population, int gdp, String description, Country country) {
        this.id = id;
        this.name = name;
        this.are = are;
        this.population = population;
        this.gdp = gdp;
        this.description = description;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAre() {
        return are;
    }

    public void setAre(double are) {
        this.are = are;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
