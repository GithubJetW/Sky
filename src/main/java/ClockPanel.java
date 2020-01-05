import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ClockPanel extends JPanel {
    public ClockPanel() {
        super();
        String currentTime = getTime();
        JLabel time = new JLabel("Time: ");
        JLabel current = new JLabel(currentTime);
        add(time);
        add(current);
    }
    
    final String getTime() {
        String time;
        // get current time and date
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int year = now.get(Calendar.YEAR);
        
        String monthName = "";
        switch (month) {
            case (1):
                monthName = "January";
            case (2):
                monthName = "February";
            case (3):
                monthName = "March";
            case (4):
                monthName = "April";
            case (5):
                monthName = "May";
            case (6):
                monthName = "June";
            case (7):
                monthName = "July";
            case (8):
                monthName = "August";
            case (9):
                monthName = "September";
            case (10):
                monthName = "October";
            case (11):
                monthName = "November";
            case (12):
                monthName = "December";           
        }
        time = monthName + " " + day + ", " + year + " " + hour + ":" + minute;
        return time;
    }
}


        

