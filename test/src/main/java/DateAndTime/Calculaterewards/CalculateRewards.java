package DateAndTime.Calculaterewards;

import javax.print.attribute.standard.NumberOfDocuments;
import java.time.*;

public class CalculateRewards {
    public static int findRewards(int noOfTasks, int completedTasks, Period period) {
        if (completedTasks == noOfTasks)
            return period.getDays() / 9;
        else if (noOfTasks * 0.75 >= completedTasks)
            return 8;
        else if (noOfTasks * 0.5 >= completedTasks)
            return 4;
        else if (noOfTasks * 0.30 >= completedTasks)
            return 3;
        else
            return 0;
    }

    public static void main(String[] args) {
        int noOfRewards = findRewards(60, 22, Period.ofDays(90));
        System.out.println("No.of rewards: "+ noOfRewards);
    }
}
