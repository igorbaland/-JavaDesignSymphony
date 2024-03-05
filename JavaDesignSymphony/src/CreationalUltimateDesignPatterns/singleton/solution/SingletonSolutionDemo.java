package CreationalUltimateDesignPatterns.singleton.solution;

public class SingletonSolutionDemo {
    public static void show() {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "muster");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
