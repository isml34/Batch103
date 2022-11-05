package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[]args){

        //ex sayilari kulancidan alan ve toplama islemi kodu yaziniz
        Scanner input = new Scanner(System.in);
        //kulanicidan ne yapacagini soyle
        System.out.println("Ilk sayiyi giriniz...");
        double sayi1 = input.nextDouble();
        System.out.println("Ikinci sayini giriniz....");

        double sayi2 = input.nextDouble();
        System.out.println(sayi1 + sayi2);
    }



    }


