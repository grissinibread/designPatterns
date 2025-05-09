package observer.exercise;

public class StockDataSource extends Subject {
    public String stock;

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
        notifyObservers();
    }
}