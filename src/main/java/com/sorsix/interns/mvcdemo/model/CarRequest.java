package com.sorsix.interns.mvcdemo.model;

import javax.validation.constraints.NotEmpty;

public class CarRequest {
    @NotEmpty
    public String make;
    @NotEmpty
    public String model;
}
