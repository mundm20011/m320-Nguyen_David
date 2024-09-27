package V3_Aktien;

public class NYStockExchange implements StockExchange {
    private String[] stockNames = {"AAPL", "TSLA", "Microsoft"};
    private double[] stockPrices = {150.0, 2800.0, 100.0};

    @Override
    public double getStockPrice(String stock) {
        for (int i = 0; i < stockNames.length; i++) {
            if (stockNames[i].equals(stock)) {
                return stockPrices[i];
            }
        }
        return 0.0;
    }

    @Override
    public void displayStockPrices() {
        System.out.println("Aktuelle Kurse an der New Yorker Börse:");
        for (int i = 0; i < stockNames.length; i++) {
            System.out.println(stockNames[i] + ": " + stockPrices[i]);
        }
    }
}

