package David_Burger.D2_Flug;

import static David_Burger.D2_Flug.lib.Input.*;

import java.util.ArrayList;
import java.util.List;;

public class Main {

    public static void main(String[] args) {
        boolean bool = true;
            Flug flugZuerichLuzern = new Flug();
            Flug flugZuerichBern = new Flug();
            Flug flugZuerichBayern = new Flug();
            Flug flugZuerichRussland = new Flug();

            flugZuerichLuzern.setStart("Zuerich");
            flugZuerichBern.setStart("Zuerich");
            flugZuerichBayern.setStart("Zuerich");
            flugZuerichRussland.setStart("Zuerich");
            flugZuerichLuzern.setEnde("Luzern");
            flugZuerichBern.setEnde("Bern");
            flugZuerichBayern.setEnde("Bayern");
            flugZuerichRussland.setEnde("Russland");

            List<Flug> fluege = new ArrayList<>();
            fluege.add(flugZuerichLuzern);
            fluege.add(flugZuerichBern);
            fluege.add(flugZuerichBayern);
            fluege.add(flugZuerichRussland);
            
            while (bool) {
            String newFirstName = inputString("Bitte geben sie ihr vorname ein");
            String newLastName = inputString("Bitte geben sie ihr nachname ein");
            String newName = newFirstName + "" + newLastName;
            System.out.println(newName);

            Passagier passagier = new Passagier();
            passagier.setName(newName);

            System.out.println("Alle verfügbaren Flüge:");
            
            int i = 0;
            for (Flug flug : fluege) {
                i = i + 1;
                String a = Integer.toString(i);
                System.out.println(a + "." + flug);
            }
            String gewuenschterFlug = inputString("Bitte geben sie ihren gewünschten flug ein");
            System.out.println(gewuenschterFlug);
            if (gewuenschterFlug.equals("1")) {
                flugZuerichLuzern.addPassagier(passagier);
            } else if (gewuenschterFlug.equals("2")) {
                flugZuerichBern.addPassagier(passagier);
            } else if (gewuenschterFlug.equals("3")) {
                flugZuerichBayern.addPassagier(passagier);
            } else if (gewuenschterFlug.equals("4")) {
                flugZuerichRussland.addPassagier(passagier);
            } else {
                System.out.println("Der Programmierer hat ein fehler gemacht");
            }
            String weiter = inputString("willst du aufhören exit");
            if (weiter.equals("exit")) {
                System.out.println("ZuerichLuzern:");
                flugZuerichLuzern.passagiereListeAusgeben();
                System.out.println("ZuerichBern:");
                flugZuerichBern.passagiereListeAusgeben();
                System.out.println("ZuerichBayern:");
                flugZuerichBayern.passagiereListeAusgeben();
                System.out.println("ZuerichRussland:");
                flugZuerichRussland.passagiereListeAusgeben();
                bool = false;
            }
            else {System.out.println("weiter");}
        }
    }
}
