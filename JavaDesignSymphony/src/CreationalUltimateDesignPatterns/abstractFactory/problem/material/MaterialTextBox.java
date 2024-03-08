package CreationalUltimateDesignPatterns.abstractFactory.problem.material;

import CreationalUltimateDesignPatterns.abstractFactory.problem.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
