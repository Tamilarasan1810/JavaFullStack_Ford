package DateAndTime.FirstDatetime;
import javax.security.auth.callback.LanguageCallback;
import javax.swing.text.html.HTMLDocument;
import java.time.*;
import java.util.Scanner;

public class DemoDateTime {
    public static void main(String[] args) {

        // to get System date
        System.out.println("System date time");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        // to get Custom date or Local date

        LocalDate date1 = LocalDate.of(2024,1,12);
        LocalDate date2 = LocalDate.of(2024,Month.FEBRUARY,12);
        System.out.println("Local date");
        System.out.println(date1);
        System.out.println(date2);

        // to get Custom time or Local time

        LocalTime time1 = LocalTime.of(6,20);
        LocalTime time2  = LocalTime.of(6,20,15);
        LocalTime time3 = LocalTime.of(6,20,15,200);
        System.out.println("Local time");
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        // to get Custom dateTime or Local dateTime

        LocalDateTime dateTime1 = LocalDateTime.of(2024,Month.FEBRUARY,20,6,20,30);
        LocalDateTime datetime2 = LocalDateTime.of(date1,time1);
        System.out.println("Local Date time");
        System.out.println(dateTime1);
        System.out.println(datetime2);

        // date and time methods
        LocalDate dates = LocalDate.of(2024,Month.FEBRUARY,20);
        System.out.println("Date Time Methods");
        System.out.println(dates);
        System.out.println(dates.plusDays(2));
        System.out.println(dates);
        dates=dates.plusDays(2);
        System.out.println(dates);
        System.out.println(dates.plusWeeks(2));

        LocalTime times = LocalTime.of(5,15);
        LocalDateTime datesTimes = LocalDateTime.of(dates,times);
        System.out.println(datesTimes);

        datesTimes = datesTimes.minusDays(1);
        System.out.println(datesTimes);


    }
}
