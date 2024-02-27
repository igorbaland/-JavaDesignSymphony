package UltimateDesignPatterns.chainofresponsibilitypattern.solution.main;

import UltimateDesignPatterns.chainofresponsibilitypattern.solution.HttpRequest;
import UltimateDesignPatterns.chainofresponsibilitypattern.solution.Webserver;
import UltimateDesignPatterns.chainofresponsibilitypattern.solution.fx.Authenticator;
import UltimateDesignPatterns.chainofresponsibilitypattern.solution.fx.Compressor;
import UltimateDesignPatterns.chainofresponsibilitypattern.solution.fx.Encryptor;

public class ChainOfResponsibilityDemo {
    public static void show() {
        //authenticator -> logger -> compressor -> encryptor
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
//        var logger = new Logger(compressor);    //disable logger

        var authenticator = new Authenticator(compressor);
        var server = new Webserver(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
        //invalid user -> logger and compressor are not going to get call
//        server.handle(new HttpRequest("-", "1234"));
    }
}
