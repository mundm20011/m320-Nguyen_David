package David_Burger.V2_Fussbal_Mannschaft;

public class Angreifer extends Spieler {
    public Angreifer(String name) {
        super(name);
    }
    
    public void jogTraining() {
        System.out.println("test");
    }

    @Override
    public String toString() {
        return "Angreifer: " + zeigeName();
    }
}
