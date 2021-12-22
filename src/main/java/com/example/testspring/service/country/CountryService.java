package com.example.testspring.service.country;


import com.example.testspring.model.country.Country;
import com.example.testspring.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService implements ICountryService {
    @Autowired
    private ICountryRepository countryRepository;

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) throws ChangeSetPersister.NotFoundException {
        return countryRepository.findById(id);
    }

    @Override
    public void save(Country category) {
      countryRepository.save(category);
    }

    @Override
    public void remove(Long id) {
        countryRepository.deleteById(id);
    }
}
