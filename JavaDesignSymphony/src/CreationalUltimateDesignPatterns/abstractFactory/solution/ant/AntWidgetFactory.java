package CreationalUltimateDesignPatterns.abstractFactory.solution.ant;

import CreationalUltimateDesignPatterns.abstractFactory.solution.Button;
import CreationalUltimateDesignPatterns.abstractFactory.solution.TextBox;
import CreationalUltimateDesignPatterns.abstractFactory.solution.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
