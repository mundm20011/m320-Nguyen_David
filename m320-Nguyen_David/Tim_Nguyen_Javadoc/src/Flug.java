package src;

import java.util.ArrayList;
import java.util.List;

public class Flug {

    List<Passagier> passagiere = new ArrayList<Passagier>();
    /**
     * All class Variables
     */

    void passagierlierListAusgeben() {
        for (Passagier p : passagiere) {
            p.nameAusgabe();
        }
    }

    
    /** 
     * @param passagier
     */
    public void addPassagier(Passagier passagier) {
        this.passagiere.add(passagier);
        System.out.println("Boarding Succesful");
    }

    /**
     * All Setter and Getter
     * The add passanger adds passanger to List
     * Getter @return class Variable
     * Setter takes @param sets the class Variable
     */
}
