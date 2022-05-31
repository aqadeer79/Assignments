import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class DateFormat {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();


//        Date Format1: Tue Aug 01 10:50:30 2017
//        Date Format2: 2017 Aug 01 10:50:30

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss yyyy");
        String fd1 = d.format(df1);
        System.out.println(fd1);

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy MMM dd HH:mm:ss");
        String fd2 = d.format(df2);
        System.out.println(fd2);

        // add month to date
        LocalDateTime myMonth = LocalDateTime.now().plusMonths(1);
        DateTimeFormatter monthFormat = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss yyyy");
        System.out.println("After adding 1 month: " + myMonth.format(monthFormat));

        // subtract days to date
        LocalDateTime myDay = LocalDateTime.now().plusDays(-15);
        DateTimeFormatter dayFormat = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss yyyy");
        System.out.println("After subtracting 15 days: " + myDay.format(dayFormat));

    }
}
