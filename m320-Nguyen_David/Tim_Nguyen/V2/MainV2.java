public class MainV2 {

    public static void main(String[] args) {
        
        System.out.println("V2 Main");

        Mannschaft team1 = new Mannschaft();

        Angreifer ronaldo = new Angreifer();
        Goalie buffon = new Goalie();
        Spieler jerome = new Verteidiger();

        team1.addPlayer(ronaldo);
        team1.addPlayer(buffon);
        team1.addPlayer(jerome);



        for (Spieler spieler : team1.getPlayers()) {
            System.out.println(spieler.spielen());
        }

    }
    
}
