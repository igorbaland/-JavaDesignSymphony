package CreationalUltimateDesignPatterns.abstractFactory.training.main;

import CreationalUltimateDesignPatterns.abstractFactory.training.Goal;
import CreationalUltimateDesignPatterns.abstractFactory.training.app.HomePage;

public class TrainingDemo {
    public static void show() {
        var homePage = new HomePage();
        homePage.setGoal(Goal.WEIGHT_LOSS);
    }
}
