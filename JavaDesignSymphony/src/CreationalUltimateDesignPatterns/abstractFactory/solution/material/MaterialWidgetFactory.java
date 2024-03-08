package CreationalUltimateDesignPatterns.abstractFactory.solution.material;

import CreationalUltimateDesignPatterns.abstractFactory.solution.Button;
import CreationalUltimateDesignPatterns.abstractFactory.solution.TextBox;
import CreationalUltimateDesignPatterns.abstractFactory.solution.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
