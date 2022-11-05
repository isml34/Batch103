package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Example 1:Kulanicidan alinan sayinin tek mi ciftmi ekrana yazan program yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz..");
        int s = input.nextInt();
        if(s%2==0){
            System.out.println("Cift sayi..");
        }

        if(s%2!=0){
            System.out.println("tek sayi");
        }

        // 2 yol
        if (s%2==0){
            System.out.println("Cift sayi yazdir");

        }else {
            System.out.println("Tek sayi...");
        }

        // Example 2 Bir sayinin negatif pozitive veya notr oldugunu soyliyen bir profram yaziniz

        System.out.println("Bir sayi giriniz...");
        double d= input.nextDouble();
        if(d>0){
            System.out.println("Pozitiv");

        } else if (d==0) {
            System.out.println("Notr");


        }else {
            System.out.println("negatif");

        }

    }
}
