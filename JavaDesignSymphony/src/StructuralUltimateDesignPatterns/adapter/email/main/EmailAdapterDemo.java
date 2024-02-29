package StructuralUltimateDesignPatterns.adapter.email.main;

import StructuralUltimateDesignPatterns.adapter.email.EmailClient;
import StructuralUltimateDesignPatterns.adapter.email.provider.GmailFilter;
import StructuralUltimateDesignPatterns.adapter.email.provider.thirdlibraries.GmailClient;

public class EmailAdapterDemo {
    public static void show() {
        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailFilter());
        emailClient.downloadEmails();
    }
}
