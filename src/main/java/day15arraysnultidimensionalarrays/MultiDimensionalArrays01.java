package day15arraysnultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {

        int arr[][] = new int[3][2];
        System.out.println(Arrays.deepToString(arr));
        arr[1][0]= 6;
        arr[0][0]= 3;
        arr[0][1]= -4;
        arr[1][1]= 18;
        arr[2][0]= -7;
        arr[2][1]= 0;
        //Multidimension Arrays console nasil yazdirilir
        System.out.println(Arrays.deepToString(arr));
        // Multidimensional Arraylerden Array elemanlardan biri nasil yazdirilir?

        System.out.println(Arrays.toString(arr[1]));

        // Multidimensional Arraylerden ic  Arraylerdeki elemanlar nasil yazdirilir?
        System.out.println(arr[1][0]);

        // Example 1: Bir String Multidimesional Array olusturunuz
        // elemanlari ekleyiniz
        // Toplam eleman sayisini ekrana yazdiran kodu yaziniz
        String brr [][] = new String[4][3];
        brr[0][0] = "A" ;
        brr[0][1] = "B" ;
        brr[0][2] = "C" ;
        brr[1][0] = "D" ;
        brr[1][1] = "E" ;
        brr[1][2] = "F" ;
        brr[2][0] = "G" ;
        brr[2][1] = "H" ;
        brr[2][2] = "I" ;
        brr[3][0] = "J" ;
        brr[3][1] = "K" ;
        brr[3][2] = "L" ;

        System.out.println(Arrays.deepToString(brr));
        int sum = 0;
        for (String[] w: brr){
            sum = sum + w.length;

        }
        System.out.println(sum);


    }
}
