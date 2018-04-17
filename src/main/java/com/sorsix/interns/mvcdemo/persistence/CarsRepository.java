package com.sorsix.interns.mvcdemo.persistence;

import com.sorsix.interns.mvcdemo.model.Car;

import java.util.List;

public interface CarsRepository {

    List<Car> getCars();
}
