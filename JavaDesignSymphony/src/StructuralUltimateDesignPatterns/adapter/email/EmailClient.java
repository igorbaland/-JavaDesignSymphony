package StructuralUltimateDesignPatterns.adapter.email;

import StructuralUltimateDesignPatterns.adapter.email.provider.EmailProvider;

import java.util.ArrayList;
import java.util.List;

public class EmailClient {
    private List<EmailProvider> providers = new ArrayList<>();

    public void addProvider(EmailProvider provider) {
        providers.add(provider);
    }

    public void downloadEmails() {
        for (var provider : providers)
            provider.downloadEmails();
    }
}
