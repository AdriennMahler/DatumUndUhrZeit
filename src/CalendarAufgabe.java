import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class CalendarAufgabe {
    public static void main(String[] args) {
        printCalendar(4, 2010); //April 2010
    }
public static void printCalendar(int month, int year){
    YearMonth localdate= YearMonth.of(year, month);



    LocalDate ersterTag = LocalDate.of(year, month, 1);
    LocalDate letzterTag= LocalDate.of(year, month, 30);
    Period p = Period.between(ersterTag, letzterTag);
    DateTimeFormatter tagft= DateTimeFormatter.ofPattern("dd");
    DateTimeFormatter dayft= DateTimeFormatter.ofPattern("EEEE");


    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM yyyy");
    System.out.println("---------------------");
    System.out.println(localdate.format(dtf));
    System.out.println("---------------------");
    String tag= ersterTag.format(tagft);
    String wochentag= ersterTag.format(dayft);

    for(int i=0; i<=p.getDays(); i++ ){
        System.out.printf( "%2s | %-10s | %n", ersterTag.format(tagft), ersterTag.format(dayft));
        ersterTag=ersterTag.plusDays(1);
    }

}
}
