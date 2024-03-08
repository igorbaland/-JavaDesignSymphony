package CreationalUltimateDesignPatterns.abstractFactory.problem.ant;

import CreationalUltimateDesignPatterns.abstractFactory.problem.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant textBox");
    }
}
