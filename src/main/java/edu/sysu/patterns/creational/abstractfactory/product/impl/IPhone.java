package edu.sysu.patterns.creational.abstractfactory.product.impl;

import edu.sysu.patterns.creational.abstractfactory.product.Phone;

/**
 * Created by SanDomingo on 9/14/14.
 */
public class IPhone extends Phone {
    public IPhone() {
        setName("iPhone 6 plus");
        setPrice(6299);
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "name='" + getName() +
                "', price=" + getPrice() +
                '}';
    }
}
