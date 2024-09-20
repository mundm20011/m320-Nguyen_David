package David_Burger.House;
// Pan / Class of the house
public class House {

    // Attrubutes of the house
    private String familyName;
    private String street;
    private int houseNumber;
    private int numberOfRooms;
    private double price;

    // initializes a new house-object
    public House() {
        familyName = ""; // we dont know yet, we set to an initial value
        street = "";
        houseNumber = 0;
        numberOfRooms = 0;
        price = 0.0;
    }

    
    /** 
     * @return String
     */
    // getter and setter here
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
