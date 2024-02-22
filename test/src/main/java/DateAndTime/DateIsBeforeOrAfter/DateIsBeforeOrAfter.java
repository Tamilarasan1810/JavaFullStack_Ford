package DateAndTime.DateIsBeforeOrAfter;

import java.time.LocalDate;
import java.time.Period;

public class DateIsBeforeOrAfter {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2002,10,18);
        LocalDate todayDate = LocalDate.now();

        System.out.println("Years: "+(todayDate.getYear()-dob.getYear()));
        System.out.println("Months: "+Math.abs(todayDate.getMonthValue() - dob.getMonthValue()));
        System.out.println("Days: "+Math.abs(todayDate.getDayOfMonth()-dob.getDayOfMonth()));
    }
}
