package David_Burger.V1_Hirachie;

public class Main {
    public static void main(String[] args) {
        Direktor firstDirektor = new Direktor("Abraham Lincoln");
        Direktor secondDirektor = new Direktor("Trump Wall");
        Lehrer abuLehrer = new Lehrer("Fabiene Malik");
        Lehrer matheLehrer = new Lehrer("Herr Tur");
        Lehrer fachkundeLehrer = new Lehrer("Harald Mueller");
        Lehrer fachkundLehrer2 = new Lehrer("Herr ich weiss es nicht");
        Sekratarin firstSekratarin = new Sekratarin("Margret", firstDirektor.getName(), null);
        Sozialarbeiter firstSozialarbeiter = new Sozialarbeiter("Ursina");
        Sozialarbeiter secondSozialarbeiter = new Sozialarbeiter("Martin Graf");
        Sozialarbeiter thirdSozialarbeiter = new Sozialarbeiter("Anne");
        Schueler firstSchueler = new Schueler("Tim Kral", new String[] {abuLehrer.getName(), matheLehrer.getName() ,fachkundeLehrer.getName()}, secondSozialarbeiter.getName());
        Schueler secondSchueler = new Schueler("Tim Nguyen", new String[] {matheLehrer.getName(), fachkundeLehrer.getName()}, thirdSozialarbeiter.getName());
        Schueler thirdSchueler = new Schueler("David Burger", new String[] {abuLehrer.getName(), matheLehrer.getName(), fachkundeLehrer.getName(), fachkundLehrer2.getName()}, firstSozialarbeiter.getName());
    
        firstSchueler.printLehrerNamen();
        secondSchueler.printLehrerNamen();
        thirdSchueler.printLehrerNamen();
    }
}
