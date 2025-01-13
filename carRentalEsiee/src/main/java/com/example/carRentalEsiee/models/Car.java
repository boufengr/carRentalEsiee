package com.example.carRentalEsiee.models;

public class Car {
    private EnumCarColors color;
    private String name;
    private String brand;
    private int price;
    public Car(EnumCarColors color, String name, String brand, int price) {
        this.color = color;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumCarColors getColor() {
        return color;
    }

    public void setColor(EnumCarColors color) {
        this.color = color;
    }
}
