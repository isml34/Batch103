package day06nestedifswitch;

import java.util.Locale;
import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz: +,  -,  *, /, %");
        char islem = input.next().charAt(0);
        System.out.println("Ilk sayiyi giriniz");
        double ilk = input.nextDouble();
        System.out.println("Ikinci sayiyi giriniz");
        switch (islem){
            case '+':
                System.out.println("ilk + ikinci");
                break;
            case '-':
                System.out.println("ilk - ikinci");
                break;
            case '*':
                System.out.println("ilk * ikinci");
                break;
            case '/':
                System.out.println("ilk / ikinci");
                break;
            case '%':
                System.out.println("ilk % ikinci");
                break;

        }

    }
}
