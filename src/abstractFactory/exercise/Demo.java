package abstractFactory.exercise;

public class Demo {
    public static void show() {
        var homePage = new HomePage();
        homePage.setGoal(new BuildMuscleFactory());
    }
}
