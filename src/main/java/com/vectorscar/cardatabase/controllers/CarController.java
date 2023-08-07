package com.vectorscar.cardatabase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vectorscar.cardatabase.entity.Car;
import com.vectorscar.cardatabase.service.CarService;

@RestController
public class CarController {
    
    @Autowired
    private CarService service;

    //Getting All the Cars
    @GetMapping("/cars")
    public List<Car> getCars(){
        return service.getCars();
    }

    //Adding List of Cars
    @PostMapping("/cars")
    public List<Car> addCars(@RequestBody List<Car> cars){
        return service.addCars(cars);
    }

    //Adding a single Car
    @PostMapping("/car")
    public Car addCar(@RequestBody Car car){
        return service.addCar(car);
    }

    //Updating a car
    @PutMapping("/car")
    public Car updateCar(@RequestBody Car car){
        return service.updateCar(car);
    }

    //Deleting by Id
    @DeleteMapping("/cars/{id}")
    public String deleteCarById(@PathVariable int id) {
        service.deleteCarById(id);
        return "Car with ID " + id + " deleted";
    }

    //Delete all Cars
    @DeleteMapping("/cars")
    public String deleteCars() {
        service.deleteCars();
        return "All Cars deleted";
    }

}
