package Q3_HashMap_Airport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import static Q3_HashMap_Airport.lib.Input.*;

public class Test {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader(
                "C:\\Users\\burge\\Documents\\TBZ\\Fachkunde\\Module\\m320\\m320-Nguyen_David\\David_Burger\\Q3_HashMap_Airport\\airports.csv");
        BufferedReader reader = new BufferedReader(fileReader);
        Map<String, String> airportMap = new HashMap<String, String>();

        List<String[]> allRows = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            String[] row = line.split(",");
            String temp1 = row[0];
            String temp2 = row[1];
            airportMap.put(temp1, temp2);
            allRows.add(row);
        }

        reader.close();
        
        String specificAirport = inputString("Suchst du ein bestimmten Flughafen? Ja/Nein: ");

        specificAirport = specificAirport.toLowerCase();

        if (specificAirport.equals("ja")) {
            String airportKey = inputString("Bitte geben sie den Flughafen Code ein: ");
            airportKey = airportKey.toUpperCase();

            System.out.println(airportMap.get(airportKey));
        } else {
            for (Map.Entry m : airportMap.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
        }

    }
}
