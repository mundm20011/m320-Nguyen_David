package D3;

import java.util.List;

public class Human {
    Heart heart;
    Brain brain;

    Human(Heart heart, Brain brain) {
        this.heart = new Heart();
        this.brain = new Brain();
    }

    public void learn(String skill) {
        brain.learn(skill);
    }
    public List<String> getLearned() {
        return getLearned();
    }

    public void heartBeat() {
        heart.beat();
    }

}
