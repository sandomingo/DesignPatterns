package edu.sysu.patterns.creational.abstractfactory.product;

/**
 * Created by SanDomingo on 9/13/14.
 */
public class Pad {
    private String name;
    private double price;

    public void sendAMail() {
        System.out.println("Sent from my " + getName());
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
}
