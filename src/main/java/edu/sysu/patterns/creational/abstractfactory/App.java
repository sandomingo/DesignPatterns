package edu.sysu.patterns.creational.abstractfactory;

import edu.sysu.patterns.creational.abstractfactory.factory.AbstractDigitalFactory;
import edu.sysu.patterns.creational.abstractfactory.product.Pad;
import edu.sysu.patterns.creational.abstractfactory.product.Phone;
import edu.sysu.patterns.creational.abstractfactory.factory.impl.AppleFactory;
import edu.sysu.patterns.creational.abstractfactory.factory.impl.SamsungFactory;

/**
 * Created by SanDomingo on 9/13/14.
 */
public class App {
    /**
     * Use a determined concrete factory to create a series products.
     * @param args
     */
    public static void main(String[] args) {
        // Using AppleFactory to create apple products
        AbstractDigitalFactory factory = new AppleFactory();
        Phone iPhone = factory.createPhone();
        System.out.println(iPhone);
        iPhone.makeACall();
        iPhone.sendAMessage();

        Pad iPad = factory.createPad();
        System.out.println(iPad);
        iPad.sendAMail();

        // Using SamsungFactory to create samsung products.
        AbstractDigitalFactory factory2 = new SamsungFactory();
        Phone galaxyNote = factory2.createPhone();
        System.out.println(galaxyNote);
        galaxyNote.makeACall();
        galaxyNote.sendAMessage();

        Pad galaxyTab = factory2.createPad();
        System.out.println(galaxyTab);
        galaxyTab.sendAMail();
    }
}
