package com.ginimbi;

public class Address {
    private String street;
    private int streetNumber;
    private String location;

    public Address(String street, int streetNumber, String location) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", location='" + location + '\'' +
                '}';
    }
}
