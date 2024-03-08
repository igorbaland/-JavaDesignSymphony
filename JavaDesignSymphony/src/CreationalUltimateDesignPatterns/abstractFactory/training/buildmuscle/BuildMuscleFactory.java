package CreationalUltimateDesignPatterns.abstractFactory.training.buildmuscle;

import CreationalUltimateDesignPatterns.abstractFactory.training.GoalFactory;
import CreationalUltimateDesignPatterns.abstractFactory.training.MealPlan;
import CreationalUltimateDesignPatterns.abstractFactory.training.WorkoutPlan;

public class BuildMuscleFactory implements GoalFactory {
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new BuildMuscleWorkout();
    }

    @Override
    public MealPlan crateMealPlan() {
        return new BuildMuscleMealPlan();
    }
}
