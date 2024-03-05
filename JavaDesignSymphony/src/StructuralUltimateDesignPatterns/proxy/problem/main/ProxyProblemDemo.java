package StructuralUltimateDesignPatterns.proxy.problem.main;

import StructuralUltimateDesignPatterns.proxy.problem.Ebook;
import StructuralUltimateDesignPatterns.proxy.problem.Library;

public class ProxyProblemDemo {
    public static void show() {
        var library = new Library();
        String[] fileNames = { "a", "b", "c" };
        for (var fileName : fileNames)
            library.add(new Ebook(fileName));

        library.openEbook("a");
    }
}
