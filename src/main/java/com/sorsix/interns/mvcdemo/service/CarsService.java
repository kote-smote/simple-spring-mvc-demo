package com.sorsix.interns.mvcdemo.service;

import com.sorsix.interns.mvcdemo.model.Car;
import com.sorsix.interns.mvcdemo.persistence.CarsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsService {

    private final CarsRepository carsRepository;

    public CarsService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public List<Car> getCars() {
        return this.carsRepository.getCars()
                .stream()
                .filter(c -> c.getModel().length() < 5)
                .collect(Collectors.toList());
    }
}
