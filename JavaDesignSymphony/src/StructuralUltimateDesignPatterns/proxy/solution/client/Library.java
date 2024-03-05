package StructuralUltimateDesignPatterns.proxy.solution.client;

import StructuralUltimateDesignPatterns.proxy.solution.proxy.Ebook;

import java.util.HashMap;
import java.util.Map;

public class Library {
    Map<String, Ebook> books = new HashMap<>();

    public void addEbook(Ebook ebook) {
        books.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName) {
        books.get(fileName).show();
    }
}
