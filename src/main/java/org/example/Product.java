package org.example;

public class Product {
    public String name;
    public double price;
    public String catagory;
    public int stock;

    public Product(String name, double price, String catagory, int stock) {
        this.name = name;
        this.price = price;
        this.catagory = catagory;
        this.stock = stock;


    }



    public String toString() {
        return "Opp " + name + ", " + price + ", " + catagory + ", " + stock;


    }

    public double discountPrice(double percent) {
        double discount = price * percent / 100;
        return price - discount;
    }

    public boolean isInStock(double price) {
        return stock > 0;

    }
}




