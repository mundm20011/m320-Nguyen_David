package David_Burger.V2_Fussbal_Mannschaft;

public class Spieler {
    public String name;

    public Spieler(String name) {
        this.name = name;
    }

    public String zeigeName() {
        return name;
    }

    public void spielen() {
        System.out.println(" Er Tritt den Ball");
    }

    @Override
    public String toString() {
        return "Spieler: " + name;
    }   
    
}
