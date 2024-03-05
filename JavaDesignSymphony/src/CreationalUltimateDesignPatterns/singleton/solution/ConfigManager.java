package CreationalUltimateDesignPatterns.singleton.solution;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    public Map<String, Object> settings = new HashMap<>();
    //2. Storing an instance of this class
    private static ConfigManager instance = new ConfigManager();

    //1. private constructor
    private ConfigManager() {}

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }

    //3. getter
    public static ConfigManager getInstance() {
        return instance;
    }
}
