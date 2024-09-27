package V3;

public class Main {
    public static void main(String[] args) {

        Portfolio timPortfolio = new Portfolio();
        ZuerichBoerse zuerich = new ZuerichBoerse();
        NYBoerse NY = new NYBoerse();
        Stock microsoftStock = new Stock();

        timPortfolio.addStockPortfolio(microsoftStock);
        timPortfolio.addStockPortfolio(microsoftStock);
        timPortfolio.addStockPortfolio(microsoftStock);

        System.out.println(timPortfolio.portfolioValue(zuerich));
        System.out.println(timPortfolio.portfolioValue(NY));


    }
}
