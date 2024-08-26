package David_Burger.Person;

public class Student extends Person {
    private String matrikelnummer ;
    public void printMatrikelnummer () {
        System.out.println (" Matrikelnummer : ␣ " + matrikelnummer );
    }
    public String getMatrikelnummer() {
        return matrikelnummer;
    }
    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }
}
