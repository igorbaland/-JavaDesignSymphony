package CreationalUltimateDesignPatterns.abstractFactory.solution.material;

import CreationalUltimateDesignPatterns.abstractFactory.solution.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
