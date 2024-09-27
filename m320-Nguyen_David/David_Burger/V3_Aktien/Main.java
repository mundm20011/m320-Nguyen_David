package V3_Aktien;

import static V3_Aktien.lib.Input.*;

public class Main {
    public static void main(String[] args) {
        String newFirstName = inputString("Bitte geben sie ihr vornamen ein: ");

        User person1 = new User("David", "Burger");
        User person2 = new User("Tim", "Nguyen");

        StockExchange zurichExchange = new ZurichStockExchange();
        StockExchange nyExchange = new NYStockExchange();

        Portfolio portfolio1 = new Portfolio(person1.getFirstName(), zurichExchange);
        portfolio1.addStock("UBS");
        portfolio1.addStock("CS");
        portfolio1.addStock("Microsoft");

        Portfolio portfolio2 = new Portfolio(person2.getFirstName(), nyExchange);
        portfolio2.addStock("Microsoft");
        portfolio2.addStock("TSLA");

        if (newFirstName.equals(person1.getFirstName())) {
            portfolio1.showPortfolio();
            portfolio1.displayStockExchangePrices();
        } else if (newFirstName.equals(person2.getFirstName())) {
            portfolio2.showPortfolio();
            portfolio2.displayStockExchangePrices();
        }
    }
}



