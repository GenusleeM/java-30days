package com.ginimbi;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private String brand;
    private BigDecimal price;

    public Car(String brand, BigDecimal price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getPrice(), car.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getPrice());
    }
}
