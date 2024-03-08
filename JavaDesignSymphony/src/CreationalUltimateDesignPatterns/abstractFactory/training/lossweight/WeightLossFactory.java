package CreationalUltimateDesignPatterns.abstractFactory.training.lossweight;

import CreationalUltimateDesignPatterns.abstractFactory.training.GoalFactory;
import CreationalUltimateDesignPatterns.abstractFactory.training.MealPlan;
import CreationalUltimateDesignPatterns.abstractFactory.training.WorkoutPlan;

public class WeightLossFactory implements GoalFactory {
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WeightLossWorkout();
    }

    @Override
    public MealPlan crateMealPlan() {
        return new WeightLossMealPlan();
    }
}
