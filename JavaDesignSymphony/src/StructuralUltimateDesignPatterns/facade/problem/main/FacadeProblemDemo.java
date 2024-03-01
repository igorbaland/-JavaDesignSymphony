package StructuralUltimateDesignPatterns.facade.problem.main;

import StructuralUltimateDesignPatterns.facade.problem.fx.Message;
import StructuralUltimateDesignPatterns.facade.problem.NotificationServer;

public class FacadeProblemDemo {
    public static void demo() {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appID", "key");
        var message = new Message("Hello world");
        server.send(authToken, message, "IdTargetDevice");
        connection.disconnect();

        /*
        The problem with this implementation
            Every time we want to send a push notification to our users, we have to follow all these steps
                create a notification server
                connect to this server
                get an authentication token
                create a message
                sending it
                disconnect...

            So many steps that we have to follow...

         Facade pattern
            to solve this problem
         */
    }
}
