package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    // Scanner kullanicidan data almaya yarar, Scanner kulanici ile etkilesim kurmamizi saglar
    // Scanner bir Java Classdir bu Classi kulanabilmek icin import etmek gerekir.
    //Scanner Clasi Javanin util kutuphanesindedir.
    public static void main(String[] args) {

        // Kullanicidan data almak icin yapilmasi gerekenler
        // 1 Adim Scanner Classindan object olustur
        Scanner imput = new Scanner(System.in);

        // 2 Adim: Kullaniciya ne yapacagini soyle

        System.out.println("Hey kulanici yasini gir...");


        //Adim. Kullanicidan aldiginiz datayi bir variable in icine koyun
        byte age = imput.nextByte();
        System.out.println("Hey kullanici senin yasin " + age);




    }
}
