package abstractFactory.exercise;

public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(GoalFactory goal) {
        workoutPlan = goal.createWorkoutPlan();
        mealPlan = goal.createMealPlan();

        System.out.println(workoutPlan);
        System.out.println(mealPlan);

    }
}
