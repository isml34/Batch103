package day05ifstatement;

import java.util.Scanner;

public class IfStatetment03 {
    public static void main(String[] args) {
        //Example 1: Kullanicidan gun isimlerini aliniz, o gunu hafta sonu mu hafta ici mi oldugunu kullaniciya soyleyiniz
     /*
     Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
     Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
      i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
      ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.

      */
        //1: yol

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz..");
        String gun = input.next();
        if (gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta ici...");

        }else if (gun.equalsIgnoreCase("Sali")) {
            System.out.println("Hafta ici...");
        }else if (gun.equalsIgnoreCase("Carsamba")) {
            System.out.println("Hafta ici...");
        }else if (gun.equalsIgnoreCase("Persembe")) {
            System.out.println("Hafta ici...");
        }else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        }else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        }else {
            System.out.println("Gecerli bir gun ismi YAZINIZ...");
        }

        //  2. yol:

        if(gun.equalsIgnoreCase("Pazar") ||
                gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        }else if(gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")){
                System.out.println("Hafta ici...");
                }else{
                System.out.println("Gecerli bir gun ismi giriniz...");
        }
        //3.Yol:

    }
}
