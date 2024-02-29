package date_module;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    private Dates(){}

    public static void main(String[] args) throws Exception {
        System.out.println(Dates.getCurrentDate()); // yyyy-mm-dd
        System.out.println(Dates.getCurrentTime()); //HH:mm:ss.ms
        System.out.println(Dates.getCurrentDateTime()); // yyyy-mm-ddTHH:mm:ss.ms
        LocalDateTime dateTime = LocalDateTime.now();// Mié, feb 28 2024
        String format = "E, MMM dd yyyy";
        System.out.println(Dates.formatDate(dateTime, format));
    }
    public static LocalDate getCurrentDate(){
        //Get current date
        return LocalDate.now();
    }

    public static LocalTime getCurrentTime(){
        //Get current hour, until seconds
        return LocalTime.now();
    }

    public static LocalDateTime getCurrentDateTime(){
        //Get date and hour, until seconds
        return LocalDateTime.now();
    }

    public static String formatDate(LocalDateTime dateTime, String format) throws Exception{
            //DateTimeFormatter.ofPattern(format) returns a DateTimeFormatter with the format the date will have
        /*  yyyy-MM-dd	"1988-09-29"
            dd/MM/yyyy	"29/09/1988"
            dd-MMM-yyyy	"29-Sep-1988"
            E, MMM dd yyyy	"Thu, Sep 29 1988"*/
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(format);
            //Format return the final date in String format
            return dateTime.format(dateFormat);
    }
}
