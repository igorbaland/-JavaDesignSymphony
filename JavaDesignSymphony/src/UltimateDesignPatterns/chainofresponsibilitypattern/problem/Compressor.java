package UltimateDesignPatterns.chainofresponsibilitypattern.problem;

import UltimateDesignPatterns.chainofresponsibilitypattern.problem.HttpRequest;

public class Compressor {
    public boolean authenticate(HttpRequest request) {
        var isValid = (request.getUsername() == "admin" &&
                request.getPassword() == "1234");

        System.out.println("Compressing");
        return isValid;
    }
}
