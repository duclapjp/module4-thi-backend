package com.example.testspring.controller;

import com.example.testspring.model.city.City;
import com.example.testspring.service.city.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private ICityService cityService;

    @GetMapping()
    public ResponseEntity<Iterable<City>> getAllCity(){
        return new ResponseEntity<>(cityService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        return new ResponseEntity<>(cityService.findById(id).get(),HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<String> editCity(@RequestBody City city){
        cityService.save(city);
        return new ResponseEntity<>("Success!",HttpStatus.OK);
    }
}
