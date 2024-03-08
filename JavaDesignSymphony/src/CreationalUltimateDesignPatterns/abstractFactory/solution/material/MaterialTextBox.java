package CreationalUltimateDesignPatterns.abstractFactory.solution.material;

import CreationalUltimateDesignPatterns.abstractFactory.solution.TextBox;

public class MaterialTextBox implements TextBox {
    public void render() {
        System.out.println("Material TextBox");
    }
}
