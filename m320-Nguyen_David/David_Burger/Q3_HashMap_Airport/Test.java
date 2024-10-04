package Q3_HashMap_Airport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader(
                "C:\\Users\\burge\\Documents\\TBZ\\Fachkunde\\Module\\m320\\m320-Nguyen_David\\David_Burger\\Q3_HashMap_Airport\\airports.csv");
        BufferedReader reader = new BufferedReader(fileReader);
        Map<String, String> map = new HashMap<String, String>();

        List<String[]> allRows = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            String[] row = line.split(",");
            String temp1 = row[0];
            String temp2 = row[1];
            map.put(temp1, temp2);
            allRows.add(row);
        }

        reader.close();

        System.out.println("Print row");
        // for (String[] row : allRows) {
        //     System.out.println(Arrays.toString(row));
        // }

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

// public static void main(String args[]){
// Map<Integer,String> map=new HashMap<Integer,String>();
// map.put(100,"Amit");
// map.put(101,"Vijay");
// map.put(102,"Rahul");
// //Elements can traverse in any order
// for(Map.Entry m:map.entrySet()){
// System.out.println(m.getKey()+" "+m.getValue());
// }
