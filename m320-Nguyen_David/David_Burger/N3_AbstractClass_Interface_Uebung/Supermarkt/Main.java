package N3_AbstractClass_Interface_Uebung.Supermarkt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<iBuyable> einkaufswagen = new ArrayList<>();

        einkaufswagen.add(new Milch());
        einkaufswagen.add(new Milch());
        einkaufswagen.add(new Bananen());

        double total = 0;
        System.out.println("Quittung:");
        for (iBuyable item : einkaufswagen) {
            System.out.println(item.getClass().getSimpleName() + ": " + item.price() + "CHF");
            total += item.price();
        }
        System.out.println("Total: " + total + "CHF");
    }
}
