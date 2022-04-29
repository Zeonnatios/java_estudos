package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class LearningDate {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date myDate = sdf1.parse("21/10/1999");
        Date myFullDate = sdf2.parse("21/10/1999 16:43:00");

        System.out.println(myDate);
        System.out.println(myFullDate);

        System.out.println(sdf1.format(myDate));
        System.out.println(sdf2.format(myFullDate));

        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Date: " + sdf1.format(currentDate));
        System.out.println("Current Date: " + sdf2.format(currentDate));

        Date currentDateMillis = new Date(System.currentTimeMillis());
        System.out.println("Current Date Millis: " + currentDateMillis);
        System.out.println("Current Date Millis: " + sdf1.format(currentDateMillis));
        System.out.println("Current Date Millis: " + sdf2.format(currentDateMillis));

        Date y1 = new Date(0L);
        Date y2 = new Date(1000L * 60L * 60L * 5L);
        System.out.println("Start: " + sdf2.format(y1));
        System.out.println("Start after 5:00h: " + sdf2.format(y2));

        Date isoDate = Date.from(Instant.parse("2022-04-28T16:47:05Z"));
        System.out.println("ISO DATE: " + sdf2.format(isoDate));

    }

}
