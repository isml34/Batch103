package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {
        //Example 1: Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz
        LocalDateTime japonya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime almanya = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        long fark = ChronoUnit.HOURS.between(almanya,japonya);
        System.out.println(fark);

        //Example 2: Sabit bir tarih olusturunuz

        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);

        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"

       Countries country = Countries.USA;
       switch (country){
           case USA:
               System.out.println("Woow");
               break;
           case UK:
               System.out.println("Big");
               break;
           case CANADA:
               System.out.println("Cold");
               break;
           case TURKEY:
               System.out.println("Vatan");
               break;
           case GERMANY:
               System.out.println("Araba");
               break;
               case RWANDA:
               System.out.println("Africa");
               break;
           default:
               System.out.println("Tanımlanmamış ülke...");

       }









    }
}
