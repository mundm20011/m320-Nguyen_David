package D3_Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    private final SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

    public String getTimestamp() {
        Date date = new Date();
        return formatter.format(date);
    }
}
