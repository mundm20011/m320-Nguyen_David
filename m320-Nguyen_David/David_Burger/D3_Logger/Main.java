package D3_Logger;

public class Main {
    public static void main(String[] args) {
        Debug debug = new Debug();
        Info info = new Info();
        Warning warn = new Warning();
        Error err = new Error();
        Logger logger = new Logger(info);
        String test = "Hello World";
        logger.log(test);
        
    }
}
