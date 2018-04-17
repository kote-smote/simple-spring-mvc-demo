package com.sorsix.interns.mvcdemo.api;

import com.sorsix.interns.mvcdemo.model.Car;
import com.sorsix.interns.mvcdemo.model.CarRequest;
import com.sorsix.interns.mvcdemo.service.CarsService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/cars")
public class CarsController {

    private final CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping
    public List<Car> getCars() {
        return this.carsService.getCars();
    }

    @PostMapping
    public Car postCar(@RequestBody @Valid CarRequest car) {
        return new Car(car.make, car.model);
    }

    @GetMapping("/custom/{make}")
    // Use Map for generating json response where we don't have a POJO class
    public Map<String, Object> getCustom(@PathVariable String make,
                                         @RequestParam String model) {
        Map<String, Object> cars = new HashMap<>();
        cars.put("make", make);
        cars.put("model", model);
        return cars;
    }

}
