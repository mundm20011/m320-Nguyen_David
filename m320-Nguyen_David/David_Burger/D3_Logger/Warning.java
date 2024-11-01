package D3_Logger;

public class Warning implements LogLevel {
    private final Time time = new Time();

    @Override
    public void log(String message) {
        System.out.println(time.getTimestamp() + " Warning: " + message);
    }
}
