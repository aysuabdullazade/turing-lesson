package org.example;

public class Opp {
    public String name;
    public double price;
    public String catagory;
    public int stock;

    public Opp(String name, double price, String catagory, int stock) {
        this.name = name;
        this.price = price;
        this.catagory = catagory;
        this.stock = stock;


    }


    public String toString() {
        return "Opp " + name + ", " + price + ", " + catagory + ", " + stock;


    }

    public double calculatePrice(double percent) {
        double discount = price * percent / 100;
        return price - discount;
    }

    public boolean isInstock(double price) {
        return stock > 0;

    }
}




