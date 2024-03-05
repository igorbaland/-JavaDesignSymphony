package CreationalUltimateDesignPatterns.singleton.problem.main;

import CreationalUltimateDesignPatterns.singleton.problem.ConfigManager;

public class SingletonProblemDemo {
    public static void show() {
        ConfigManager manager = new ConfigManager();
        manager.set("name", "Mustermann");

        ConfigManager other = new ConfigManager();
        System.out.println(other.get("name"));
    }
}
