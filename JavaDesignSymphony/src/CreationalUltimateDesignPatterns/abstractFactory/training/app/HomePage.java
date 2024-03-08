package CreationalUltimateDesignPatterns.abstractFactory.training.app;

import CreationalUltimateDesignPatterns.abstractFactory.training.Goal;
import CreationalUltimateDesignPatterns.abstractFactory.training.MealPlan;
import CreationalUltimateDesignPatterns.abstractFactory.training.WorkoutPlan;
import CreationalUltimateDesignPatterns.abstractFactory.training.buildmuscle.BuildMuscleMealPlan;
import CreationalUltimateDesignPatterns.abstractFactory.training.buildmuscle.BuildMuscleWorkout;
import CreationalUltimateDesignPatterns.abstractFactory.training.lossweight.WeightLossMealPlan;
import CreationalUltimateDesignPatterns.abstractFactory.training.lossweight.WeightLossWorkout;

public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(Goal goal) {
        if (goal == Goal.BUILD_MUSCLE) {
            workoutPlan = new BuildMuscleWorkout();
            mealPlan = new BuildMuscleMealPlan();
        }
        else if (goal == Goal.WEIGHT_LOSS) {
            workoutPlan = new WeightLossWorkout();
            mealPlan = new WeightLossMealPlan();
        }

        System.out.println(workoutPlan);
        System.out.println(mealPlan);
    }
}
