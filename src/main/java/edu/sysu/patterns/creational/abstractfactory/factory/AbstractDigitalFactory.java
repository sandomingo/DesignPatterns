package edu.sysu.patterns.creational.abstractfactory.factory;

import edu.sysu.patterns.creational.abstractfactory.product.Pad;
import edu.sysu.patterns.creational.abstractfactory.product.Phone;

/**
 * Created by SanDomingo on 9/13/14.
 */
public abstract class AbstractDigitalFactory {
    public abstract Phone createPhone();

    public abstract Pad createPad();
}
