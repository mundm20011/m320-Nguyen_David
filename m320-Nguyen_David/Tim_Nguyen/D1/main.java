public class Main {
    public static void main(String[] args) {
        Heater heater1 = new Heater(20, 10, 0, 30);

        System.out.println(heater1.getTemperature());
        heater1.setHeaterWarmer();
        System.out.println(heater1.getTemperature());
        heater1.setHeaterColder();
        System.out.println(heater1.getTemperature());

    }
}
