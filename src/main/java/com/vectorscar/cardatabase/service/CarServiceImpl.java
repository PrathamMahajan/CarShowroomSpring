package com.vectorscar.cardatabase.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.vectorscar.cardatabase.entity.Car;
import com.vectorscar.cardatabase.repository.CarRepository;

public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository repository;

    @Override
    public List<Car> getCars() {
        return repository.findAll();
    }

    @Override
    public List<Car> addCars(List<Car> cars) {
        return repository.saveAll(cars);
    }

    @Override
    public Car addCar(Car car) {
        return repository.save(car);
    }

    @Override
    public Car updateCar(Car car){
        Car existingCar = repository.findById(car.getId()).orElse(null);
        existingCar.setName(car.getName());
        existingCar.setModel(car.getModel());
        existingCar.setFuelType(car.getFuelType());
        return repository.save(existingCar);
    }

    @Override
    public void deleteCars() {
        repository.deleteAll();
    }

    @Override
    public void deleteCarById(int id){
        repository.deleteById(id);
    }
}
