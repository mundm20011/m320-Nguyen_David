package V3_Aktien;

public class ZurichStockExchange implements StockExchange {
    private String[] stockNames = {"UBS", "CS", "Microsoft"};
    private double[] stockPrices = {15.5, 10.2, 120.0};

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
        System.out.println("Aktuelle Kurse an der Zürcher Börse:");
        for (int i = 0; i < stockNames.length; i++) {
            System.out.println(stockNames[i] + ": " + stockPrices[i]);
        }
    }
}
