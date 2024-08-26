package David_Burger.Person;

public class Main {
    public static void main(String[] args) {
        Apprentice tesApprentice = new Apprentice(null, null);
        tesApprentice.setTopic("null");
        tesApprentice.setName("albert");
        System.out.println(tesApprentice.getTopic());
        System.out.println(tesApprentice.getName());
    }

}
