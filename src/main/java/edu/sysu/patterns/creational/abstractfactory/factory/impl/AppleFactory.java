package edu.sysu.patterns.creational.abstractfactory.factory.impl;

import edu.sysu.patterns.creational.abstractfactory.factory.AbstractDigitalFactory;
import edu.sysu.patterns.creational.abstractfactory.product.Pad;
import edu.sysu.patterns.creational.abstractfactory.product.Phone;
import edu.sysu.patterns.creational.abstractfactory.product.impl.IPad;
import edu.sysu.patterns.creational.abstractfactory.product.impl.IPhone;

/**
 * Created by SanDomingo on 9/13/14.
 */
public class AppleFactory extends AbstractDigitalFactory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public Pad createPad() {
        return new IPad();
    }
}
