package David_Burger.D1_Heizung;

public class Heizung {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heizung() {
        temperature = 0;
        min = 0;
        max = 0;
        increment = 0;
    }

    public void setHeizungNewTemperature() {
        if (increment > 0 && temperature + increment <= max) {
            this.temperature = temperature + increment;
        } else if (increment < 0 && temperature - increment >= min) {
            this.temperature = temperature + increment;
        } else {
            System.out.println("Die eingegebene zahl ist falsch");
        };
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }
    // public static void main(String[] args) {
    //     Heizung heizungTest = new Heizung();

    //     heizungTest.setTemperature(0);
    //     heizungTest.setMin(-10);
    //     heizungTest.setMax(10);
    //     heizungTest.setIncrement(3);

    //     System.out.println(heizungTest.getTemperature());
    //     System.out.println(heizungTest.getMin());
    //     System.out.println(heizungTest.getMax());
    //     System.out.println(heizungTest.getIncrement());
        
    //     heizungTest.setHeizungNewTemperature();
    //     System.out.println(heizungTest.getTemperature());
    //     heizungTest.setHeizungNewTemperature();
    //     System.out.println(heizungTest.getTemperature());
    //     heizungTest.setHeizungNewTemperature();
    //     System.out.println(heizungTest.getTemperature());
    //     heizungTest.setIncrement(-7);
    //     heizungTest.setHeizungNewTemperature();
    //     System.out.println(heizungTest.getTemperature());
    //     heizungTest.setHeizungNewTemperature();
    //     System.out.println(heizungTest.getTemperature());
        
    //     // System.out.println(heizungTest.getMax());
    // }

}
