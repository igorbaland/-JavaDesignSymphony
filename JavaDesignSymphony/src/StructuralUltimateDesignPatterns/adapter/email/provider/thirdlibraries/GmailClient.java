package StructuralUltimateDesignPatterns.adapter.email.provider.thirdlibraries;

public class GmailClient {
    public void connect() {
        System.out.println("Connecting to Gmail");
    }

    public void getEmails() {
        System.out.println("Downloading emails from");
    }

    public void disconnect() {
        System.out.println("Disconnecting from Gmail");
    }
}
