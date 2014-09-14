package edu.sysu.patterns.creational.abstractfactory.product.impl;

import edu.sysu.patterns.creational.abstractfactory.product.Phone;

/**
 * Created by SanDomingo on 9/14/14.
 */
public class GalaxyNote extends Phone {
    public GalaxyNote() {
        setName("Galaxy Note 4");
        setPrice(5999);
    }

    @Override
    public String  toString() {
        return "Galaxy Note{" +
                "name='" + getName() +
                "\', price=" + getPrice()
                + "}";
    }
}
