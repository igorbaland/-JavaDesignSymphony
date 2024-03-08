package CreationalUltimateDesignPatterns.abstractFactory.training;

public interface GoalFactory {
    WorkoutPlan createWorkoutPlan();
    MealPlan crateMealPlan();
}
