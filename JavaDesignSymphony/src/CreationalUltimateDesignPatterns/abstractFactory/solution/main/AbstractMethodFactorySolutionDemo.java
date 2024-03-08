package CreationalUltimateDesignPatterns.abstractFactory.solution.main;

import CreationalUltimateDesignPatterns.abstractFactory.solution.ant.AntWidgetFactory;
import CreationalUltimateDesignPatterns.abstractFactory.solution.app.ContactForm;
import CreationalUltimateDesignPatterns.abstractFactory.solution.material.MaterialWidgetFactory;

public class AbstractMethodFactorySolutionDemo {
    public static void show() {
        new ContactForm().render(new AntWidgetFactory());
        /*
        An abstract factory method provides an interface for creating families or related objects
         */
//        new ContactForm().render(new MaterialWidgetFactory());
    }
}
