package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str = "Java is easy";
        String str2 = "Kara kara dusunme Ankara";
        int idxA = str.indexOf("a");
        System.out.println(idxA);
        //lastIndexOf() methodu
        int idxA2 = str.lastIndexOf("a");
        System.out.println(idxA2);
        int idxa1 = str2.indexOf("a");
        System.out.println(idxa1);
        //lastIndexOf() methodu
        int idxa2 = str2.lastIndexOf("a");
        System.out.println(idxa2);


        //2 example
        String s = "Mississippi";
        int idxI =s.indexOf('i');// indexOf hem string hemde char ile kullanilabilir
        System.out.println(idxI);//1
        int indiss1 =  s.indexOf("iss");// ilk gorunumun ilk karekterin indexini verir
        int indiss2 = s.lastIndexOf("iss");// son gorunumun ilk karakterine verir
        System.out.println(indiss2);

        //Example 1  Bir String'deki bir character'in tekrarli veya tekrarszi olup olmadigini gosteren kodu yaziniz



         String t = "Helloooo";
         char o='l';
         if(t.indexOf('o')==t.lastIndexOf('o')){
             System.out.println("Tekrarsiz");
         }else{
             System.out.println("Tekrarli");
         }

         String u = "Learn Java earn money";
         //indexof() iki paramettre ile kulanilirsa ikinci parametrede verilen sayi kadar karakteri gectikten sonra  istenen karakterin
        //ilk gorunumunun indexini return eder
         int sonuc = u.indexOf("e",4);
        System.out.println(sonuc);
        int son = u.lastIndexOf("a",5);
        System.out.println(son);
        String v = "";
        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.
        //Eger String'de hic character yoksa isEmpty() "true" return eder, her hangi bir character varsa "false" return eder.
        // length()==0 demek isEmpty() true verir demektir.
        //Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);


        String x = "";
        //isBlank() hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder.
        boolean blankMi= x.isBlank();
        System.out.println(blankMi);
        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();
        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else{
            System.out.println(ilk);
        }


    }
}
