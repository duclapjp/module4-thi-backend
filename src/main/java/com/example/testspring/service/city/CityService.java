package com.example.testspring.service.city;


import com.example.testspring.model.city.City;
import com.example.testspring.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CityService implements ICityService {
    @Autowired
    private ICityRepository cityRepository;

    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) throws ChangeSetPersister.NotFoundException {
        return cityRepository.findById(id);
    }

    @Override
    public void save(City blog) {
        cityRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        cityRepository.deleteById(id);
    }

}
