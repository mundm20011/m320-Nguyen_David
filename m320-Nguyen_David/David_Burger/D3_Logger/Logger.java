package D3_Logger;

public class Logger implements LogLevel {
    LogLevel logger;
    public Logger(LogLevel logger) {
        this.logger = logger;
    }
    @Override
    public void log(String args) {
        this.logger.log(args);
    }
}
