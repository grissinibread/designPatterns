package observer.exercise;

public class StockListView implements Observer {
    StockDataSource stockDataSource;

    public StockListView(StockDataSource stockDataSource) {
        this.stockDataSource = stockDataSource;
    }

    @Override
    public void update() {
        System.out.println("Stock List updated with value: " + stockDataSource.getStock());
    }
}
