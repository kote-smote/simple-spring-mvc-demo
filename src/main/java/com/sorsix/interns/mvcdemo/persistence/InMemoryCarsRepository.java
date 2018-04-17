package com.sorsix.interns.mvcdemo.persistence;

import com.sorsix.interns.mvcdemo.model.Car;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
@Profile("dev")
public class InMemoryCarsRepository implements CarsRepository {

    private final List<Car> cars = Arrays.asList(
            new Car("Mazda", "RX9"),
            new Car("Citroen", "Cactus"),
            new Car("Mercedes", "C-Class"),
            new Car("Bmw", "M300")
    );

    public List<Car> getCars() {
        return cars;
    }
}
