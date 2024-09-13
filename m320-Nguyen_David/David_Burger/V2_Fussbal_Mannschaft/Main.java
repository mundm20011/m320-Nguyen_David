package David_Burger.V2_Fussbal_Mannschaft;

public class Main {
    public static void main(String[] args) {
        Goalie onlyGoalie = new Goalie(15.8, "Harald");
        Goalie imposterGoalie = new Goalie(5.24, "Tim");
        Angreifer firstAngreifer = new Angreifer("Max");
        Angreifer secondAngreifer = new Angreifer("Peter");
        Angreifer thirdAngreifer = new Angreifer("Goliath");
        Angreifer fourthAngreifer = new Angreifer("David");
        Angreifer fivedAngreifer = new Angreifer("Sebastian");
        Angreifer sixAngreifer = new Angreifer("Bastian");
        Angreifer seventhAngreifer = new Angreifer("Jasmin");
        Angreifer eightAngreifer = new Angreifer("Omar");
        Angreifer ninthAngreifer = new Angreifer("Karl");
        Angreifer tenthAngreifer = new Angreifer("Matthias");
        Angreifer eleventhAngreifer = new Angreifer("Markus");
        Angreifer twelthAngreifer = new Angreifer("Moritz");
        Angreifer thierdtenAngreifer = new Angreifer("Fritz");
        Angreifer fourthtenAngreifer = new Angreifer("Mathew");
        Angreifer fithedtenAngreifer = new Angreifer("Gautham");
        Angreifer sixtenAngreifer = new Angreifer("Not Null");
        Verteidiger firstVerteidiger = new Verteidiger("No Name");
        Verteidiger secondVerteidiger = new Verteidiger("Nobody");
        Verteidiger thirdVerteidiger = new Verteidiger("Somebody");
        Verteidiger fourthVerteidiger = new Verteidiger("Noone");

        Mannschaft randoMannschaft = new Mannschaft();

        randoMannschaft.addSpielerToMannschaft(onlyGoalie);
        randoMannschaft.addSpielerToMannschaft(firstAngreifer);
        randoMannschaft.addSpielerToMannschaft(secondAngreifer);
        randoMannschaft.addSpielerToMannschaft(thirdAngreifer);
        randoMannschaft.addSpielerToMannschaft(fourthAngreifer);
        randoMannschaft.addSpielerToMannschaft(fivedAngreifer);
        randoMannschaft.addSpielerToMannschaft(sixAngreifer);
        randoMannschaft.addSpielerToMannschaft(seventhAngreifer);
        randoMannschaft.addSpielerToMannschaft(eightAngreifer);
        randoMannschaft.addSpielerToMannschaft(ninthAngreifer);
        randoMannschaft.addSpielerToMannschaft(tenthAngreifer);
        randoMannschaft.addSpielerToMannschaft(eleventhAngreifer);
        randoMannschaft.addSpielerToMannschaft(twelthAngreifer);
        randoMannschaft.addSpielerToMannschaft(thierdtenAngreifer);
        randoMannschaft.addSpielerToMannschaft(fourthtenAngreifer);
        randoMannschaft.addSpielerToMannschaft(fithedtenAngreifer);
        randoMannschaft.addSpielerToMannschaft(sixtenAngreifer);
        randoMannschaft.addSpielerToMannschaft(firstVerteidiger);
        randoMannschaft.addSpielerToMannschaft(secondVerteidiger);
        randoMannschaft.addSpielerToMannschaft(thirdVerteidiger);
        randoMannschaft.addSpielerToMannschaft(fourthVerteidiger);

        randoMannschaft.getMannschaft();
    }
}
