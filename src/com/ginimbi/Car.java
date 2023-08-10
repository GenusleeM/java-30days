package com.ginimbi;


import java.io.Serializable;
import java.math.BigDecimal;


public class Car implements Serializable {

    //Java bean
//A class must have noarg constructor
// A class fields must be private and can be accessed thru getters and setters
// A class should implement serializable
    private String regNumber;
    private BigDecimal price;

    public Car(){}


}

