package UltimateDesignPatterns.observer.spreedsheet;

public class SpreedSheet implements Observer {
    private DataSource dataSource;

    public SpreedSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified: " + dataSource.getValue());
    }
}
