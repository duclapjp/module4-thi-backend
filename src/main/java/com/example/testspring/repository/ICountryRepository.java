package com.example.testspring.repository;


import com.example.testspring.model.country.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country,Long> {
}