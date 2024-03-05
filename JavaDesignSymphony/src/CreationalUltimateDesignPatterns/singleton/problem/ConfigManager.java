package CreationalUltimateDesignPatterns.singleton.problem;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    /*
    for managing the configuration settings of our application.

    In this class, we need a map or a dictionary for storing our application settings.

    Searching
        ctrl + n
     */
    private Map<String, Object> settings = new HashMap<>();

    public Object get(String key) {
        return settings.get(key);
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }
}
