package day15arraysnultidimensionalarrays;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

            //binarySearch() Method: Bu method'u kullanarak bir elemanın Array'de olup olmadığını anlarız.
            //                       binarySearch() Method'unu kullanmadan önce mutlaka Arrays.sort() kullanılmalıdır.
            //                       binarySearch() Method'u aradığınız eleman Array'de varsa o elemanın index'ini return eder.
            //                       binarySearch() Method'u aradiginiz eleman Array'de yoksa "- a" seklinde bir negatif sayi alirsiniz.
            //                       Bu sayidaki "-" isaretinin anlami bu eleman Array'de yok dmeektir, "a" nin anlami olsaydi kacinci sirada olurdu demektir.
            //                       binarySearch() Method'u tekrarlayan elemanlar icin kullanilmaz.
            int arr[] = {12, 31, 43, 14};

            int sayi = 43;

            Arrays.sort(arr);// [ 12, 14, 31, 43 ]

            int idx1 = Arrays.binarySearch(arr, sayi);
            System.out.println(idx1);//3

            int sayi2 = 58;
            int sonuc = Arrays.binarySearch(arr, sayi2);

            System.out.println(sonuc);

        }

    }
