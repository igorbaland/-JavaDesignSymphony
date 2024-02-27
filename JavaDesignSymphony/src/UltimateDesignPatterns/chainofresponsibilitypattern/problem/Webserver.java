package UltimateDesignPatterns.chainofresponsibilitypattern.problem;

public class Webserver {
    public void handle(HttpRequest request) {
        //Authentication, Logging, Compression
        //Each class has a single responsibility

        //tightly coupled, to solve this problem we can use an interface
        //but the order of these actions will be hard coded inside this class. If in the future we want to disable
        // logging, we have to come back and change code in this class. Similar if we want ad another step, like
        // encryption. Again we have to come back and change the code in this class
        var authenticator = new Authenticator();
        authenticator.authenticate(request);
    }
}
