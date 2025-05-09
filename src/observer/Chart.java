package observer;

public class Chart implements Observer {
    DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart updated: " + dataSource.getValue());
    }
}
