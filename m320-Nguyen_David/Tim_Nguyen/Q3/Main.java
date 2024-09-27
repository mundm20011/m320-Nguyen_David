package Q3;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        map.put("Tim", new ArrayList<String>()); //no ArrayList assigned, create new ArrayList
        map.put("David", new ArrayList<String>()); //no ArrayList assigned, create new ArrayList

        map.get("Tim").add("David"); //adds value to list.
        map.get("Tim").add("Kral"); //adds value to list.

        map.get("David").add("Thomas"); //adds value to list.



        while(true) {

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Gibt deine suche ein!!!");

            String searchParam = myObj.nextLine();  // Read user input

            System.out.println(map.get(searchParam));

        }




    }


}
