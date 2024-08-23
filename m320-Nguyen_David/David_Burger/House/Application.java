package David_Burger.House;

public class Application {
    
    public static void main(String[] args) {
        System.out.println("hello java classes and objects");
        // we build a house of the family Smith
        House houseSmith = new House();
    }

    String familyName = houseSmith.getFamilyName();
        System.out.println(familyName);
        
        System.out.println(houseSmith.getNumberOfRooms());
}


// Klassennamen beginnen mit einem Grossbuchstaben, zusammengesetzte Wörter werden im CamelCase geschrieben z.B. HouseCity.
// Die Klasse House wird in der Datei House.java gespeichert!
// der Konstruktor hat den gleichen Namen der Klasse + ()!
// Objektnamen starten klein und werden auch mit CamelCase beschrieben.