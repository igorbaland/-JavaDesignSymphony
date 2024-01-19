package UltimateDesignPatterns.strategy;

import UltimateDesignPatterns.strategy.encryption.AES;
import UltimateDesignPatterns.strategy.encryption.ChatClient;
import UltimateDesignPatterns.strategy.solution.BlackAndWhiteFilter;
import UltimateDesignPatterns.strategy.solution.ImageStorage;
import UltimateDesignPatterns.strategy.solution.JPEGCompressor;
import UltimateDesignPatterns.strategy.solution.PngCompressor;

public class DemoStrategy {
    /*
    difference between
      stage
       - a single state
         Our example from state pattern
            a canvas object can behave differently depending on the current tool. And all these behaviors are
            represented by a subclass of this tool interface

      strategy
       - multiple state
            -- different behaviors are represented using difference strategy objects
     */

    public static void showEncryption() {
        var client = new ChatClient( new AES());
        client.send("Hi");
    }

    public static void showImageStorage() {
        var imageStorage = new ImageStorage();
        imageStorage.store("a",
                new JPEGCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("b",
                new PngCompressor(), new BlackAndWhiteFilter());
    }
}
