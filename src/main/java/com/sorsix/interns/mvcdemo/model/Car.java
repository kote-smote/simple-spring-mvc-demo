package com.sorsix.interns.mvcdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {
    private final String make;
    private final String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    @JsonProperty("theModel")
    public String getModel() {
        return model;
    }

}
