package David_Burger.Person;

public class Person {
    private String name;
    private String vorname;

    public void print () {
        System.out.println (" Nachname : ␣" + name );
        System.out.println (" Vorname : ␣ ␣" + vorname );    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}
