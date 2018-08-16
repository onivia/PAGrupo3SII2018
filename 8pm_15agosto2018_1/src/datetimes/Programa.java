package datetimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class Programa {
    public static void main(String[] args) {
        //LocalDate
        //LocalTime
        //LocalDateTime
        
        LocalDateTime ldt1 = LocalDateTime.now(); //formate ISO_DATE        
        LocalDateTime ldt2 = LocalDateTime.parse("2015-10-25T13:00:00.000");
        LocalDateTime ldt3 = LocalDateTime.of(2016, Month.OCTOBER, 29, 20, 10, 50);        
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy_hh:mm:ss.SSS a");        
        //System.out.println(ldt1.format(dtf1));
        
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");        
        LocalDate ld1 = LocalDate.parse("28-02-2018", dtf2);
        
        //System.out.println(ld1.format(dtf2));
        
        //System.out.println(ld1.plusDays(1));
        
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime ldt4 = LocalDateTime.now();
        LocalDateTime ldt5 = LocalDateTime.parse("14-08-2018 13:00:00", dtf3);
        
        System.out.println(ChronoUnit.DAYS.between(ldt5, ldt4));
    }
}
