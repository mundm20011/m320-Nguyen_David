package David_Burger.D2_Flug;

import static David_Burger.D2_Flug.lib.Input.*;

import java.util.ArrayList;
import java.util.List;;

/**
 * 
 * @author David Burger
 */

public class Main {
    /**
     * This is a program for adding multiple peoble to diffrents flyed in java.
     * 
     * @param args
     */

    public static void main(String[] args) {
        /**
         * This is the main method
         * which is very important for
         * execution for a java program.
         */
        boolean bool = true;
        Flug flugZuerichLuzern = new Flug();
        Flug flugZuerichBern = new Flug();
        Flug flugZuerichBayern = new Flug();
        Flug flugZuerichRussland = new Flug();
        /**
         * Declared the possibe flyed
         */

        flugZuerichLuzern.setStart("Zuerich");
        flugZuerichBern.setStart("Zuerich");
        flugZuerichBayern.setStart("Zuerich");
        flugZuerichRussland.setStart("Zuerich");
        flugZuerichLuzern.setEnde("Luzern");
        flugZuerichBern.setEnde("Bern");
        flugZuerichBayern.setEnde("Bayern");
        flugZuerichRussland.setEnde("Russland");
        /**
         * Add the diffrent flyed routes
         */

        List<Flug> fluege = new ArrayList<>();
        fluege.add(flugZuerichLuzern);
        fluege.add(flugZuerichBern);
        fluege.add(flugZuerichBayern);
        fluege.add(flugZuerichRussland);
        /**
         * Create a Array with the possible flyed
         */

        while (bool) {
            String newFirstName = inputString("Bitte geben sie ihr vorname ein");
            String newLastName = inputString("Bitte geben sie ihr nachname ein");
            /**
             * Declared two variables newFirstName and newLastName.
             * And taking input from the user
             * by using the imported input libary from
             * 
             * @author Philipp Gressly Freimann V0.1
             * @author Michael Kellenberger V0.2 ...
             */
            String newName = newFirstName + "" + newLastName;
            System.out.println(newName);
            /**
             * combined newFirstName and newLastName and print the combined name for the user
             */

            Passagier passagier = new Passagier();
            passagier.setName(newName);
            /**
             * put the new user inside the class Passagier
             */

            System.out.println("Alle verfügbaren Flüge:");

            int i = 0;
            for (Flug flug : fluege) {
                i = i + 1;
                String a = Integer.toString(i);
                System.out.println(a + "." + flug);
            }
            /**
             * print out every possible flyed for the user
             */
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
            /**
             * the user can add the passagier to the choosen flyed
             */
            String weiter = inputString("willst du aufhören exit");
            /**
             * the user can input if he is finished or not
             */
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
                /**
                 * if the user is finished the programm print out all flyed with the passagiers on it
                 */
            } else {
                System.out.println("weiter");
                /**
                 * if the user not finished the programm starts at the beginning of the loop
                 */
            }
        }
    }
}
