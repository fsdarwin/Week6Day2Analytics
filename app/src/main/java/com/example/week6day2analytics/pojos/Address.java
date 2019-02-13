package com.example.week6day2analytics.pojos;

public class Address {

    private String address;
    private String city;
    private String state;
    private String postal;
    private String country;

    public Address() {
    }

    public Address(String address, String city, String state, String postal, String country) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.postal = postal;
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
