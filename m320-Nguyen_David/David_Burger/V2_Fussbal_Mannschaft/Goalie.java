package David_Burger.V2_Fussbal_Mannschaft;

public class Goalie extends Spieler {
    private double koerperGroesse;

    public Goalie(double koerperGroesse, String name) {
        super(name);
        this.koerperGroesse = koerperGroesse;
        
    }

    public void spielen() {
        System.out.println(" Er Wirft den Ball");
    }

    
    /** 
     * @return double
     */
    public double getKoerperGroesse() {
        return koerperGroesse;
    }

    public String toString() {
        return "Goalie: " + zeigeName() + ", Körpergröße: " + koerperGroesse;
    }
}
