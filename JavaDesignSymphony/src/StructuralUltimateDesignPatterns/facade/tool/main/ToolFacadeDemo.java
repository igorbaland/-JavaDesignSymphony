package StructuralUltimateDesignPatterns.facade.tool.main;

import StructuralUltimateDesignPatterns.facade.tool.TwitterAPI;

public class ToolFacadeDemo {
    public static void show() {
        var twitterAPI = new TwitterAPI("appKey", "secret");
        var tweets = twitterAPI.getRecentTweets();
    }
}
