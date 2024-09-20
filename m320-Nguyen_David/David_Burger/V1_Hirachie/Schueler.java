package David_Burger.V1_Hirachie;

public class Schueler extends Personen {
    private String[] lehrerName;
    private String sozialarbeiterName;

    public Schueler(String name, String[] lehrerName, String sozialarbeiterName) {
        super(name);
        this.lehrerName = lehrerName;
        this.sozialarbeiterName = sozialarbeiterName;
    }

    
    /** 
     * @return String[]
     */
    public String[] getLehrerName() {
        return lehrerName;
    }

    public void setLehrerName(String[] lehrerName) {
        this.lehrerName = lehrerName;
    }

    public String getSozialarbeiterName() {
        return sozialarbeiterName;
    }

    public void setSozialarbeiterName(String sozialarbeiterName) {
        this.sozialarbeiterName = sozialarbeiterName;
    }

    public void printLehrerNamen() {
        System.out.println("Lehrer von " + name + ":");
        for (String lehrer : lehrerName) {
            System.out.println(lehrer);
        }
        System.out.println("Sozialarbeiter von " + name + ":");
        System.out.println(sozialarbeiterName);
        System.out.println();

    }
}
