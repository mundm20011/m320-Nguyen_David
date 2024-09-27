package V3;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    List<Stock> stocks = new ArrayList<>();

    public void addStockPortfolio(Stock stock) {
        this.stocks.add(stock);
    }

    public int portfolioValue(StockExchange mankannirgendeinennamennehmenmitinterfaces) {
        int portfolioValue = 0;
        for (Stock stock : stocks) {
            portfolioValue += stock.getPercentage() * mankannirgendeinennamennehmenmitinterfaces.getStock();
        }
        return portfolioValue;
    }

    // Getter and Setter
    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}

