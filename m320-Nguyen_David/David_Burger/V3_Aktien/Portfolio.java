package V3_Aktien;

import java.util.ArrayList;

public class Portfolio {
    private String userName;
    private ArrayList<String> stocks;
    private StockExchange stockExchange;

    public Portfolio(String userName, StockExchange stockExchange) {
        this.userName = userName;
        this.stocks = new ArrayList<>();
        this.stockExchange = stockExchange;
    }

    public String getUserName() {
        return userName;
    }

    public void addStock(String stock) {
        stocks.add(stock);
    }

    public void showPortfolio() {
        System.out.println("Portfolio von " + userName + ": " + stocks);
        System.out.println("Aktuelle Kurse:");
        for (String stock : stocks) {
            double price = stockExchange.getStockPrice(stock);
            System.out.println(stock + ": " + price);
        }
    }

    public void displayStockExchangePrices() {
        stockExchange.displayStockPrices();
    }
}


