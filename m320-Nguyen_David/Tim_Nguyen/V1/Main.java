package V1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Lehrer mueller = new Lehrer("mueller");
        Schueler tim = new Schueler("tim");
        Sozialarbeiter jimmy = new Sozialarbeiter("jimmy");
        Sekretaerin tom = new Sekretaerin("tom");
        Direktor jonson = new Direktor("jonson");

        // System.err.println(mueller.getName());
        // System.err.println(tim.getName());
        // System.err.println(jimmy.getName());
        // System.err.println(tom.getName());
        // System.err.println(jonson.getName());

        // String[] allPersons = { "mueller", "tim", "jimmy", "tom", "jonson" }; nicht typesierte array!
        
        ArrayList<Person> Persons = new ArrayList<Person>(); // typisierte array!
        Persons.add(mueller);
        Persons.add(tim);
        Persons.add(jimmy);
        Persons.add(tom);
        Persons.add(jonson);


        for (Person person : Persons) {
            System.out.println(person.getName());
        }

    }

}
