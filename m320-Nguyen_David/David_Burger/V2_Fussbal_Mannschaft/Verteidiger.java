package David_Burger.V2_Fussbal_Mannschaft;

public class Verteidiger extends Spieler {
    public Verteidiger(String name) {
        super(name);
    }

    public void spielen() {
        System.out.println(" Er Nimmt den Ball");
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Verteidiger: " + zeigeName();
    }
}
