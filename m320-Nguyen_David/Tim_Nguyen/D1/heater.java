
public class Heater {

    private int temperature;
    private int min;
    private int max;
    private int increment;


    public Heater(int temperature, int increment, int min, int max) {
        setTemperature(temperature);
        setIncrement(increment);
        setTemperature(min);
        setTemperature(max);
    }

    private boolean validTempColder(int temperature, int increment) {
        if (temperature - increment < min) {
            return false;
        }
        return true;
    }

    private boolean validTempWarmer(int temperature, int increment) {
        if (temperature + increment > max) {
            return false;
        }
        return true;
    }

    public void setHeaterColder() {
        if (!validTempColder(temperature, increment)) {
            System.out.println("setting the heater colder is not possible");
            return;
        }
        int newTemperature = temperature - increment;
        setTemperature(newTemperature);
    }

    public void setHeaterWarmer() {
        if (!validTempWarmer(temperature, increment)) {
            System.out.println("setting the heater warmer is not possible");
            return;
        }
        int newTemperature = temperature + increment;
        setTemperature(newTemperature);
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
}