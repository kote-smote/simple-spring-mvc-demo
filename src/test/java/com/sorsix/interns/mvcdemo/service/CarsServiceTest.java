package com.sorsix.interns.mvcdemo.service;

import com.sorsix.interns.mvcdemo.model.Car;
import com.sorsix.interns.mvcdemo.persistence.CarsRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CarsServiceTest {

    CarsService carsService;

    @Before
    public void setup() {
        carsService = new CarsService(() -> Arrays.asList(
                new Car("Citroen", "Cactus"),
                new Car("Citroen", "Pro"),
                new Car("Citroen", "C3"),
                new Car("Citroen", "C2")
        ));
    }

    @Test
    public void test_get_cars() {
        int actual = this.carsService.getCars().size();
        assertEquals(3, actual);
    }
}