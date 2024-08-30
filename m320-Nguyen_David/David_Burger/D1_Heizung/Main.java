package David_Burger.D1_Heizung;

public class Main {
    public static void main(String[] args) {
        Heizung heizungTest = new Heizung();

        heizungTest.setTemperature(0);
        heizungTest.setMin(-10);
        heizungTest.setMax(10);
        heizungTest.setIncrement(3);

        System.out.println(heizungTest.getTemperature());
        
        heizungTest.setHeizungNewTemperature();
        System.out.println(heizungTest.getTemperature());
        heizungTest.setHeizungNewTemperature();
        System.out.println(heizungTest.getTemperature());
        heizungTest.setHeizungNewTemperature();
        System.out.println(heizungTest.getTemperature());
        heizungTest.setHeizungNewTemperature();
        heizungTest.setHeizungNewTemperature();
        System.out.println(heizungTest.getTemperature());
        heizungTest.setIncrement(1);
        heizungTest.setHeizungNewTemperature();
        System.out.println(heizungTest.getTemperature());
        heizungTest.setIncrement(-1);
        heizungTest.setHeizungNewTemperature();
        System.out.println(heizungTest.getTemperature());
        heizungTest.setHeizungNewTemperature();
        System.out.println(heizungTest.getTemperature());
    }
}
