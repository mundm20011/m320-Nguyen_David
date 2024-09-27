import java.util.ArrayList;
import java.util.List;

public class Mannschaft {

    private List<Spieler> mannschaft = new ArrayList<>();

    public void addPlayer(Spieler spieler) {
        mannschaft.add(spieler);
    }

    public List<Spieler> getPlayers() {
        return mannschaft;
    }
}
    

