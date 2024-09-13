package David_Burger.V2_Fussbal_Mannschaft;
import java.util.ArrayList;

public class Mannschaft {
    ArrayList<Spieler> newMannschaft = new ArrayList<Spieler>();

    //this part inside class Mannschaft
    public void addSpielerToMannschaft(Spieler spieler) {
        newMannschaft.add(spieler);
    }

    // public void getMannschaft() {
    //     for (int i = 0; i < newMannschaft.size(); i++) {
    //         System.out.println(newMannschaft.get(i));
    //     }
    // }

    public void getMannschaft() {
        for (int i = 0; i < newMannschaft.size(); i++) {
            Spieler spieler = newMannschaft.get(i);
            System.out.print(spieler);
            spieler.spielen();  // Aufruf der Methode `spielen()`
        }
    }
    
}
