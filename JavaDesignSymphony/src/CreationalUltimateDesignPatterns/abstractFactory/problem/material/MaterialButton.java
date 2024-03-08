package CreationalUltimateDesignPatterns.abstractFactory.problem.material;

import CreationalUltimateDesignPatterns.abstractFactory.problem.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
