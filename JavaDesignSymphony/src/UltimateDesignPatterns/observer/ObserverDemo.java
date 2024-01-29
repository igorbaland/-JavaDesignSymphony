package UltimateDesignPatterns.observer;

import UltimateDesignPatterns.observer.spreedsheet.Chart;
import UltimateDesignPatterns.observer.spreedsheet.DataSource;
import UltimateDesignPatterns.observer.spreedsheet.SpreedSheet;
import UltimateDesignPatterns.observer.stock.StatusBar;
import UltimateDesignPatterns.observer.stock.Stock;
import UltimateDesignPatterns.observer.stock.StockListView;

public class ObserverDemo {
    public static void showStocks() {
        var statusBar = new StatusBar();
        var stockListView = new StockListView();

        var stock1 = new Stock("stock1", 10);
        var stock2 = new Stock("stock2", 20);
        var stock3 = new Stock("stock3", 30);

        statusBar.addStock(stock1);
        statusBar.addStock(stock2);
        statusBar.addStock(stock3);

        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        stock2.setPrice(21);

        stock3.setPrice(9);
    }

    public static void showSpreedSheet() {
        var dataSource = new DataSource();
        var sheet1 = new SpreedSheet(dataSource);
        var sheet2 = new SpreedSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}
