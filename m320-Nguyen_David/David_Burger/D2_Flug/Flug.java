package David_Burger.D2_Flug;

import java.util.ArrayList;
import java.util.List;

public class Flug {
    List<Passagier> passagiere = new ArrayList<Passagier>();
    String start;
    String ende;


    void passagiereListeAusgeben() {
        for (Passagier p: passagiere) {
            p.nameAusgaben();
        }
    }

    public void addPassagier(Passagier passagier) {
        passagiere.add(passagier);
    }

    public String getStart() {
        return start;
    }


    public void setStart(String start) {
        this.start = start;
    }


    public String getEnde() {
        return ende;
    }


    public void setEnde(String ende) {
        this.ende = ende;
    }

    public String toString() {
        return "Flug von " + start + " nach " + ende;
    }
    
}
