package StructuralUltimateDesignPatterns.facade.problem;

import StructuralUltimateDesignPatterns.facade.problem.fx.AuthToken;
import StructuralUltimateDesignPatterns.facade.problem.fx.Connection;
import StructuralUltimateDesignPatterns.facade.problem.fx.Message;

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
