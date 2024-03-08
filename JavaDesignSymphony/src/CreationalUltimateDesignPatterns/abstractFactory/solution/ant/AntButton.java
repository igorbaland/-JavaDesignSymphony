package CreationalUltimateDesignPatterns.abstractFactory.solution.ant;

import CreationalUltimateDesignPatterns.abstractFactory.solution.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button.");
    }
}
