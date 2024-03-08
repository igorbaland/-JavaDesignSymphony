package CreationalUltimateDesignPatterns.abstractFactory.solution.ant;

import CreationalUltimateDesignPatterns.abstractFactory.solution.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant textBox.");
    }
}
