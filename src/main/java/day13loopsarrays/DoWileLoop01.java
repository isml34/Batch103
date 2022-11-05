package day13loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class DoWileLoop01 {
           /*
             example 1 kullanıcıdan bir sayi aliniz sayi 100 den kucuk ise ekrana kazandin yazdiriniz
             aksi halde ekrana kaybettin yazdiriniz
             kullanici kazandikca oyun devam etmeli
            */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int sayi = 0;
//        do {
//            System.out.println("Bir sayi giriniz");
//             sayi = input.nextInt();
//            if (sayi<100){
//                System.out.println("Kazandiniz");
//            }
//        }while (sayi<100);
//        System.out.println("Kaybetiniz");
//
        //example 2 kullanicidan ismini aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz
        do {
            System.out.println("Isminizi giriniz..");
            char ilkharf = input.next().charAt(0);
            if (ilkharf>='A' && ilkharf<='Z'){
                System.out.println("ismi basariyla girdiniz");
            }else{
                System.out.println("Ismi yanlis girdiniz icin isleminiz iptal edilmistir");
                break;
            }
        }while (true);


        // Infinite Loop: Sonsuz dogru
        //bunu sakin calistirma
        // Artirma azaltma kisminda hata yaparsaniz Ifinite loop sorunsali olusur.

//        for ( int i = 1; i<4; i--){
//            System.out.println("Hi");
//        }
        // Artirma azaltma kismini yazmazsaniz infite loop sorunsal i olusur.

//           for ( int i = 1; i<4; ){
//            System.out.println("Hi");
//           }
//
//           int i = 12;
//           while (i<15){
//               System.out.println("Hi");
//           }
        int numbers []=new int []{10,13,56,20,40,60,56,80};
        //System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
       // System.out.println(Arrays.toString(numbers));
        int kucuk = numbers[0];
        System.out.println(kucuk);
        int son = numbers[numbers.length-1];
        System.out.println(son);


        //int sum= 0;
        for (int i=0; i<numbers.length; i++){

           // sum = sum + numbers[i];

        }
        System.out.println();




        }
}
