package day26exceptions;

import java.util.Scanner;

public class Exceptions04 {
    //Yas'i ekrana yazdiran bir method olusturunuz

    public static void main(String[] args) {
        int age = 250;

        try {
            printAge(age);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }
    //Yaşı ekrana yazdıran bir method oluşturunuz
    public static void printAge(int age) {

        if (age<0 || age>200) {
            throw new IllegalArgumentException("Yaş negatif olamaz veya 200'den büyük olamaz.");
        }
        System.out.println(age);


    }
}
