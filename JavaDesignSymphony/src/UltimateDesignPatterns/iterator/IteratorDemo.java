package UltimateDesignPatterns.iterator;

import UltimateDesignPatterns.iterator.problem.BrowseHistory;
import UltimateDesignPatterns.iterator.product.Product;
import UltimateDesignPatterns.iterator.product.ProductCollection;
import UltimateDesignPatterns.iterator.solution.BrowseHistoryArray;
import UltimateDesignPatterns.iterator.solution.BrowseHistoryList;
import UltimateDesignPatterns.iterator.solution.Iterator;

public class IteratorDemo {

    public static void showProduct() {
        var collection = new ProductCollection();
        collection.add(new Product(1, "a"));
        collection.add(new Product(2, "b"));
        collection.add(new Product(1, "c"));

        UltimateDesignPatterns.iterator.product.Iterator iterator =
                collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }

    }

    public static void showBrowserHistorySolution() {
        var history = new BrowseHistoryArray();
//        var history = new BrowseHistoryList();

        history.push("a");
        history.push("b");
        history.push("c");

        Iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }

    public static void showBrowseHistoryProblem() {
        /*
        Let's say we want to iterate over the history and print the urls we have visited. Currently, this is not
        possible. Because list field is private.
         */
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        /*
        One way to solve this problem is to create a getter for this field.

        There is a problem in this implementation. If tomorrow we decide to use a different data structure to store the
        list of urls, our main class is going to break.
         */
        for (var i = 0; i < history.getUrls().size(); i++) {
            var url = history.getUrls().get(i);
            System.out.println(url);
        }



    }
}
