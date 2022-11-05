package day01variables;

import javax.swing.plaf.PanelUI;

public class Variables01 {
    //variables nasil olusturulur
    //1Access modifier 2Data type 3 Variable name 4= 5 deger 6;


public int age = 13;
public  int height = 183;
public byte price = 120;
public short populationOfVillsge = 23000;

 /*
  BUNLARA PRIMITIVE DATA TYPE: denir-- bunun icinde sadece deger vardir

         1)İnt: Intiger'in kisaltmasi. Intiger tam sayı demektir.32 bit kullanır
            Matematik'de tamsayıların basi vesonru yoktur fakat Java'da tamsayilarin basi ve sonu vardir.
            En kucuk int = -2,147483.648
            En buyuk int = 2,147,483,647

        2)byte: Tamsayılar icin kullanilir. 8 bit kullanır
            En kucuk byte= -128
            En buyuk byte= 127

        3)short: Tamsayilar icin. 16 bit kullanır
                En kucuk short = -32768
                En buyuk short = 32767
.
        4) Long: Tamsayilar icin. 64 bit kullanir.
                en kucuk long =-923.372.836.854.755.808
                en Buyuk long = 923.372.836.854.755.808

       5. float  Ondalikli sayilar icindir
                 foat virgulden sonra 7 basamak icerir
                 float degerinde sonra f veya F koymaniz gerekir
       6. dounle ondalikli saylar icindir.
                 double virgulden sonra 16 basamak icerir
       7. boolean: true veya false degerleri icin kulanilir 1 bit kulanir.
       8 char: Tek karakterler icin kulanilir. 16 Bit kulanir
        A, c 2, -, ?,
        Note: Java buyuk ve kucuk harfleri duyarlidir.
              Java icin True ile true tamamen farklidir
        Note: Numeric data types: byte< short < int < long < float < double
        numeric olmayan data types: boolean - char



        NON- Primitive Data Type-- bunlar icinde deger ve mothods var
        String: Isim adres kimlik numuarasi gibi bir  veya birdem fazla karakter iceren degerlerde kulanilir.
                String degerleri mutlaka cift tirnak arasina konulmalidir.
                String non-primitive dir. Yani bir String olusturdugunuzda Java size bir suru method verir.
                Primitive ile Non-Primitive lerin farki nedir?
              1)Non-primitive data type'larinda degerin yaninda method'lar vardir.
                Primitive data type'larinda ise sadece deger vardir, method yoktur.
              2)Primitive data type'lari  Java tarafindan olusturulmustur, toplam 8 tanedir, biz Primitive data olusturamayiz
                Non-Primitve data type'lari Java tarafindan da olusturulmustur, biz de olusturabiliriz. Non-Primitive sayilamayacak
                kadar coktur, cunku her developer Non-Primitive data type olusturabilir.
              3)Primitive data type isimleri kucuk harflerle baslar
                Non-Primitive data type isimleri buyuk harfle baslar
              4)Primitive data type'lar memory'de farkli buyuklukte yerler kullanir.
                Non-Primitive'lerin hepsi memory'de ayni buyuklukte yer kullanirlar.
  */
public float priceOfShirt = 13.99f;
public double weightOfCell = 0.00000122845;
public long populationOfWorld = 7000000000L;
public long x = 1234;
public boolean isOld = true;
public boolean isRich = false;
public char initial = 'S';



 public String name = "Tom Hanks";

 public static void main(String[] args) {
 }






}










