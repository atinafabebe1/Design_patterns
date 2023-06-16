package observer;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        SpreedSheet spreedSheet1 = new SpreedSheet();
        SpreedSheet spreedSheet2 = new SpreedSheet();
        Chart chart = new Chart();

        dataSource.attach(chart);
        dataSource.attach(spreedSheet1);
        dataSource.attach(spreedSheet2);

        dataSource.setValue(1);

    }
}
