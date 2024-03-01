package StructuralUltimateDesignPatterns.facade.solution;

import StructuralUltimateDesignPatterns.facade.solution.fx.Message;

public class NotificationService {
    public void send(String message, String targetDevice) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appID", "key");
        server.send(authToken, new Message(message), targetDevice);
        connection.disconnect();
    }
}
