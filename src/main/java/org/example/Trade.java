package org.example;

public class Trade {
    String id;
    String symbol;
    int quantity;
    double price;

    public Trade(String id, String symbol, int quantity, double price){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.setPrice(price);
    }

    public Trade(String id, String symbol, int quantity){
        this(id, symbol, quantity, 0);
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return (id + " " + symbol + " " + quantity + " " + price);
    }
}
