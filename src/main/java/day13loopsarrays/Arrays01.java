package day13loopsarrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arrays01 {
    /*
    1) Ayni data tipinde coklu data i depolama icin Javanin olusturdugu yapilar vardir.
      Bu yapilarardan birisi de Array lerdir.
     */
    public static void main(String[] args) {
        // Array nasil olusturulur


        int stdAges[] = new int[7];// [0, 0, 0, 0, 0, 0, 0, ]
        // Array nsil yazdirilir
        System.out.println(Arrays.toString(stdAges));

        // Arraylere elemanlar nasil eklernir?

        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));
        //Array deki herhangi bir elemani nasil yazdirabiliriz.
        System.out.println(stdAges[4]);

        //Arraydeki en kucuk ve en buyuk elemani ekrani yazdiriniz
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));
        int ilk = stdAges[0];
        // Note length() Stringlerde kullanir lengh Arraylerde parantessiz kulanillir
        int son = stdAges[stdAges.length-1];
        System.out.println(ilk + son);

        //example 2 StdAges  Arraydeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz
            int sum= 0;
        for (int i=0; i<stdAges.length; i++){

            sum = sum + stdAges[i];

        }
        System.out.println(sum);

        // 2 Yol: wile loop

        int i = 0;
        int toplam =0;
        while (i<stdAges.length){
            toplam= toplam + stdAges[i];
            i++;

        }
        System.out.println(toplam);

        // 3 yol

        int k =0;
        int s =0;
        do {
            s = s + stdAges[k];
            k++;

        }while (k<stdAges.length);
        System.out.println(s);


        //4. for each loop Arraylrde ve Collectionslarda kullanilir
        int t =0;
        for (int w: stdAges){
            t=t+w;

        }
        System.out.println(t);



        // Example 3: S tring bir array olusturunuz
        // Bu Arraye 5 tane isim yerlestiriniz
        // Bu isimlerdeki karakter sayilarininn toplamini ekrana yazdiriniz

        String stdNames[] = new String[5];


        stdNames[0]= "Ali";
        stdNames[1]= "Tom";
        stdNames[2]= "Veli";
        stdNames[3]= "Kemal";
        stdNames[4]= "Cem";
        int karakterSayilariToplami =0;
        for (String w: stdNames){
           karakterSayilariToplami = karakterSayilariToplami + w.length();
        }
        System.out.println(karakterSayilariToplami);


        // Example 4: Char bir array olusturunuz
        // bu arraye 5 eleman ekleyiniz
        // Bu arraydeki sadece buyuk harfleri ekrana yazdiriniz

        char ch[] = {'A', 'c', 'D','k','M'};
        for (char w: ch){

            if (w>='A' && w<='Z'){
                System.out.print(w);
            }
        }

//
//        int numbers []=new int []{10,13,56,20,40,60,56,80};
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        int kucuk = numbers[0];
























    }
}
