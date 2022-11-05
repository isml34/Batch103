package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

/*
ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.
Array ile ArrayList'in farki nedir?
1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
  Array'ler eleman sayisinda "fixed" dirler.
  ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
2)Array'lerin icine "primitive" ve "reference" lar konabilir.
  ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
      eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin
 */

        ArrayList<Integer> ages = new ArrayList<Integer>();
        // YOL
        ArrayList<Integer> heights = new ArrayList<>();
        //3 Yol
        List<Integer> nums = new ArrayList<>();

        // ArayListler nasil yazdirilir?
        System.out.println(nums);

        // ArrayListlere nasil eleman eklenir?
        // add methodu her zaman elemani en sona ekleer.. (insortion order)

        nums.add(21);
        nums.add(18);
        nums.add(20);

        System.out.println(nums);
        nums.add(1,50);
        System.out.println(nums);

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(183);
        nums.addAll(prices);
        System.out.println( nums);
        System.out.println(prices);

        nums.addAll(2,prices);
        System.out.println(nums);

        // ArrayListlerin eleman sayisini nasil belirleriz
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);

        // Arraylistlerde herhangi bir elemani nasil secilir?

        int el1 = nums.get(3);
        System.out.println(el1);

        //Arraylistin bos olup olmadigini nasil bakariz?
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);

        // Arrayliste bir eleman nasil degistirilir


        nums.set(3, 200);
        System.out.println(nums);


        //Example 1. Nums arraylistindeki tum tek saylari 11 artirdiktan sonra ekrana yazdiriniz.

        for (int w: nums){
            if (w%2!=0){
                nums.set(nums.indexOf(w), w+11);





            }
        }
        System.out.println(nums);
        // remove method icine tam sayi koyarsaniz java onu index olarak kabul eder.
        // ArrayLissten 34 elemaninin ilk gorumunu siliniz

        //Note 1: Tum tamsaylar java icin aksi soylenmedikce primitive dir yani int dir
        // note 2: primitiveler Arraylistlerin elemani olamaz
        // note 3: primitive i WrapperClass a cevirirseniz non-primitive olur ve non primitive ler ArrayListlerin elemani olur index olamaz
        Integer sayi = 34;
        nums.remove(sayi);
        System.out.println(nums);




    }
}
