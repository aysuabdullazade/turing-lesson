package org.example;

public class Moto {
    public String model;
    public String color;
    public String engine;
    public double price;

    public Moto(String model, String color, String engine, double price) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.price = price;



    }

    public String toString() {
        return "Moto " + model + " " + color + " " + engine + " " + price;
    }
}
