package edu.sysu.patterns.creational.abstractfactory.product.impl;

import edu.sysu.patterns.creational.abstractfactory.product.Pad;

/**
 * Created by SanDomingo on 9/14/14.
 */
public class IPad extends Pad {
    public IPad() {
        setName("iPad Air");
        setPrice(3888);
    }

    @Override
    public String toString() {
        return "iPad{" +
                "name='" + getName() +
                "', price=" + getPrice() +
                "}";
    }
}
