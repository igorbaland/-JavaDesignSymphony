package StructuralUltimateDesignPatterns.proxy.problem;

import java.util.HashMap;
import java.util.Map;

public class Library {
    Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook) {
        ebooks.put(ebook.getFilename(), ebook);
    }

    public void openEbook(String fileName) {
        ebooks.get(fileName).show();
    }
}
