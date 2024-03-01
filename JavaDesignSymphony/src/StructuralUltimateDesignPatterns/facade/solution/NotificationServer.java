package StructuralUltimateDesignPatterns.facade.solution;

import StructuralUltimateDesignPatterns.facade.solution.fx.AuthToken;
import StructuralUltimateDesignPatterns.facade.solution.fx.Connection;
import StructuralUltimateDesignPatterns.facade.solution.fx.Message;

public class NotificationServer {
    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String targetDevice) {
        System.out.println("Sending a message");
    }
}
