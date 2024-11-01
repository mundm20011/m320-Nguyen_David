package D3_Logger;

public class Error implements LogLevel {
    private final Time time = new Time();

    @Override
    public void log(String message) {
        System.out.println(time.getTimestamp() + " Error: " + message);
    }
}
