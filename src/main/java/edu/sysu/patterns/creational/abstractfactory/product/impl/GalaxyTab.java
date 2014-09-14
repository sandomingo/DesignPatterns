package edu.sysu.patterns.creational.abstractfactory.product.impl;

import edu.sysu.patterns.creational.abstractfactory.product.Pad;

/**
 * Created by SanDomingo on 9/14/14.
 */
public class GalaxyTab extends Pad {
    public GalaxyTab() {
        setName("Galaxy Tab 10");
        setPrice(4288);
    }

    @Override
    public String toString() {
        return "Galaxy Tab 10{" +
                "name='" + getName() +
                "', price=" + getPrice() +
                "}";
    }
}
