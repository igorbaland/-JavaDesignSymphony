package StructuralUltimateDesignPatterns.facade.tool;

import java.util.ArrayList;
import java.util.List;

public class TwitterClient {
    public List<Tweet> getRecentTweets(String accessToken) {
        System.out.println("Greeting recent tweets");

        return new ArrayList<>();
    }
}
