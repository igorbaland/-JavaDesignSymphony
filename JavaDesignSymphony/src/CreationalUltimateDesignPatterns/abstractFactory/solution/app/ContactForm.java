package CreationalUltimateDesignPatterns.abstractFactory.solution.app;

import CreationalUltimateDesignPatterns.abstractFactory.solution.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
