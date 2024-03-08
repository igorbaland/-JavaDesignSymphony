package CreationalUltimateDesignPatterns.abstractFactory.problem.ant;

import CreationalUltimateDesignPatterns.abstractFactory.problem.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant button");
    }
}
