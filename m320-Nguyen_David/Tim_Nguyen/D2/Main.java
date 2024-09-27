package D2;

import java.util.Scanner; // Import the Scanner class to read text files

/**
 * @author Tan Dat Tim
 */
/**
 * This is a programm for booking flights
 *
 * @param args
 */
public class Main {

    
    /** 
     * @param args
     */
    
     public static void main(String[] args) {
        /**
         * This is the main method which runs the programm
         */

        Flug flugChicken = new Flug();
        /**
         * Init and declares the flight
         */

        while (true) {

            System.out.println();
            System.out.println("1 um Flug zu buchen");
            System.out.println("2 um alle Passagiere zu sehen");
            System.out.println("3 um das programm zu verlassen");
            System.out.println();
            /**
             * Logs all the Options
             */

            Scanner number = new Scanner(System.in);
            String option = number.nextLine();
            /**
             * Init and deklares Scanner for Input
             */
            System.out.println();

            if (option.equals("1")) {
                System.out.println("gib deinen namen ein");
                Scanner input = new Scanner(System.in);
                String passengername = input.nextLine();
                Passagier passagier = new Passagier(passengername);

                flugChicken.addPassagier(passagier);
                System.out.println();
                System.out.println("du wurdest hinzugefügt");
            } else if (option.equals("2")) {
                System.out.println("Hier sind alle passagiere");
                flugChicken.passagierlierListAusgeben();
            } else if (option.equals("3")) {
                return;
            }

            /**
             * if the Option 1 is Selected then it creates a passenger and adds it to the plane
             * if the Option 2 is Selected the programm logs all the passenger
             * if the Option 3 is Selected @return nothing and leave loop
             */
        }

    }
}
