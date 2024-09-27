public class Goalie extends Spieler{

    private double koerperGroesse;

    public double getKoerperGroesse() {
        return koerperGroesse;
    }

    public void setKoerperGroesse(double koerperGroesse) {
        this.koerperGroesse = koerperGroesse;
    }

    @Override
    public String spielen() {
        return "Was eine Parade vom Goalie";
    }
    

}