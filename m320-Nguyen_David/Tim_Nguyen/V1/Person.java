package V1;

public class Person {
    private String name;

    public Person (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // konstrucktur das wenn die sub klasse super benutzt das man mit setter name setzten kann von der superklasse
}
