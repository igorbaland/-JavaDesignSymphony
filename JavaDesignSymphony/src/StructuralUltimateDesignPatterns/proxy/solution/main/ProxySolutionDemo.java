package StructuralUltimateDesignPatterns.proxy.solution.main;

import StructuralUltimateDesignPatterns.proxy.solution.client.Library;
import StructuralUltimateDesignPatterns.proxy.solution.proxy.subjectproxy.LoggingEbookProxy;

public class ProxySolutionDemo {
    public static void show() {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames)
            library.addEbook(new LoggingEbookProxy(fileName));
//            library.addEbook(new EbookProxy(fileName));

        library.openEbook("a");
        library.openEbook("b");

        /*
        Our implementation is following the open closed principle, because tomorrow we can supply a different proxy
        implementation. For example, we can create the proxy that performs authorization or logging.

        We are changing behavior by adding a new class without modifying an existing code. This is the open closed
        principle
         */
    }
}
