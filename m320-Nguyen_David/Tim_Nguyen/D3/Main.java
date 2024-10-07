package D3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Heart timsHeart = new Heart();
        Brain timsBrain = new Brain();
        Human tim = new Human(timsHeart, timsBrain);
        Main main = new Main();

        tim.learn("eating");
        tim.learn("jumping");
        tim.learn("walking");
        tim.getLearned();
        tim.heartBeat();

        while (true) {
            printOptions();

            Scanner number = new Scanner(System.in);
            String option = number.nextLine();

            switch(option) {
                case "1":
                    main.createHuman();
                    break;
                case "2":
                    main.getSkillsHuman();
                    break;
                    case "3":
                    main.learnSkills();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("input invalid");
            }



        }


    }

    public Map<String, Human> humans = new HashMap<>();

    public void createHuman() {
        System.out.println("gebe deinen Namen ein.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        Human human = new Human(new Heart(), new Brain());
        humans.put(name, human);
    }

    public void getSkillsHuman() {
        System.out.println("gebe deinen Namen ein.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        Human human = humans.get(name);
        human.getLearned();
    }

    public void learnSkills() {

        System.out.println("gebe deinen Namen ein.");
        Scanner input1 = new Scanner(System.in);
        String name = input1.nextLine();

        System.out.println("gebe deinen Skill ein.");
        Scanner input = new Scanner(System.in);
        String skill = input.nextLine();

        Human human = humans.get(name);
        human.learn(skill);



    }
    public static void printOptions() {
        System.out.println();
        System.out.println("1 um Mensch zu erstellen");
        System.out.println("2 um skills zu bekommen");
        System.out.println("3 um skills zu lernen");
        System.out.println("4 um das programm zu verlassen");
        System.out.println();
    }


}
