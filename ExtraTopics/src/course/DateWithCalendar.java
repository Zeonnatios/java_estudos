package course;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateWithCalendar {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date isoDate = Date.from(Instant.parse("2022-04-28T16:47:05Z"));
        System.out.println("ISO DATE: " + sdf.format(isoDate));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(isoDate);
        calendar.add(Calendar.HOUR_OF_DAY, 4);
        isoDate = calendar.getTime();
        System.out.println("NEW ISO DATE +4H:" + isoDate );

        int minutes = calendar.get(Calendar.MINUTE);
        int hours = calendar.get(Calendar.HOUR);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

    }

}
