package UltimateDesignPatterns.observer;

import UltimateDesignPatterns.observer.spreedsheet.Chart;
import UltimateDesignPatterns.observer.spreedsheet.DataSource;
import UltimateDesignPatterns.observer.spreedsheet.SpreedSheet;

public class ObserverDemo {
    public static void show() {
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
