package N3_AbstractClass_Interface_Uebung.Supermarkt;

public class Produkte implements iBuyable {
    private String name;
    private double price;

    public Produkte(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public double price() {
        return price;
    }

    public String getName() {
        return name;
    }
}
