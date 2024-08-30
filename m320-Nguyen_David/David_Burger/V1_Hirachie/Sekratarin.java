package David_Burger.V1_Hirachie;

public class Sekratarin extends Personen {
    
    private String direktorName;
    private String lehrerName;

    public Sekratarin(String name, String direktorName, String lehrerName) {
        super(name);
        this.direktorName = direktorName;
        this.lehrerName = lehrerName;
    }

    public String getDirektorName() {
        return direktorName;
    }

    public void setDirektorName(String direktorName) {
        this.direktorName = direktorName;
    }

    public String getLehrerName() {
        return lehrerName;
    }

    public void setLehrerName(String lehrerName) {
        this.lehrerName = lehrerName;
    }
    
}
