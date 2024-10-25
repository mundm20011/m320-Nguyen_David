package D3;

import java.util.ArrayList;
import java.util.List;

public class Brain {
    private List<String> learned = new ArrayList<>() ;

    public void learn(String information) {
        learned.add(information);
    }

    public List<String> getLearned() {
        for (String text : learned) {
            System.out.println(text);
        }
        return learned;
    }
}
