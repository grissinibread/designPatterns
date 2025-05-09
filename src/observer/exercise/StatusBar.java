package observer.exercise;

public class StatusBar implements Observer {
    StockDataSource stockDataSource;

    public StatusBar(StockDataSource stockDataSource) {
        this.stockDataSource = stockDataSource;
    }

    @Override
    public void update() {
        System.out.println("StatusBar updated with value: " + stockDataSource.getStock());
    }
}
