package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        // Ex 1: Javadan aldiginiz Date ay gun yil olarak yaziniz
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = dft1.format(currentDate);
        System.out.println(formattedDate1);
        DateTimeFormatter dft2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dft2.format(currentDate);
        System.out.println(formattedDate2);
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate = dft.format(currentDate);
        System.out.println(formattedDate);


        // EX 2.
        LocalTime myTime = LocalTime.of(21, 36, 55, 2345);
        System.out.println(myTime);
        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");//"HH" 24 saat sistemini, "hh" 12 saat sistemini kullanir
        String formattedMyTime1 = dtf7.format(myTime);
        System.out.println(formattedMyTime1);//04:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm");
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);


    }

}
