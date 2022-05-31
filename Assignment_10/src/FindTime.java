import java.util.Calendar;
import java.util.TimeZone;

public class FindTime {
    public static void main(String[] args) {
        // currentTimeMillis() returns time since 1970

        long seconds = System.currentTimeMillis();
        System.out.println(seconds/1000l);

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.set(2022, Calendar.MAY, 30, 14, 1, 54);
        long secondsSinceEpoch = calendar.getTimeInMillis() / 1000L;
        System.out.println(secondsSinceEpoch);
    }
}
