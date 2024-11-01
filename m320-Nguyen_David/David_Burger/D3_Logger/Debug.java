package D3_Logger;

public class Debug implements LogLevel {
    Time time = new Time();
    @Override
    public void log(String message) {
        System.out.println(time.getTimestamp() + " Debug: " + message);
    }
}
