package StructuralUltimateDesignPatterns.adapter.email.provider;

import StructuralUltimateDesignPatterns.adapter.email.provider.thirdlibraries.GmailClient;

public class GmailFilter implements EmailProvider{
    private GmailClient client = new GmailClient();

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
