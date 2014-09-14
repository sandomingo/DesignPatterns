package edu.sysu.patterns.creational.abstractfactory.factory.impl;

import edu.sysu.patterns.creational.abstractfactory.factory.AbstractDigitalFactory;
import edu.sysu.patterns.creational.abstractfactory.product.Pad;
import edu.sysu.patterns.creational.abstractfactory.product.Phone;
import edu.sysu.patterns.creational.abstractfactory.product.impl.GalaxyNote;
import edu.sysu.patterns.creational.abstractfactory.product.impl.GalaxyTab;

/**
 * Created by SanDomingo on 9/13/14.
 */
public class SamsungFactory extends AbstractDigitalFactory {
    @Override
    public Phone createPhone() {
        return new GalaxyNote();
    }

    @Override
    public Pad createPad() {
        return new GalaxyTab();
    }
}
