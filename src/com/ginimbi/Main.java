package com.ginimbi;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
         Address gieAddress = new Address("12",45,"Harare");
         Car car = new Car("Honda",new BigDecimal("200"));
         Car[] cars = {car};
        Person person = new Person(
                "Genuslee",
                "Mapedze",
                23,
                gieAddress,
                Gender.MALE,
                "gmapedze@gmail.com",
                "+263783783782",
                cars

                );

        System.out.println(person);
    }


}
