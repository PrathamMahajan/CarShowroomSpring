package com.vectorscar.cardatabase.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.vectorscar.cardatabase.entity.Car;

@Service
public interface CarService {

    public List<Car> getCars();

    public List<Car> addCars(List<Car> cars);

    public Car addCar(Car car);

    public Car updateCar(Car car);

    public void deleteCars();

    public void deleteCarById(int id);
    
}
