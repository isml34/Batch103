package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String a = "Java Kolaydir..";
        // Startswith  ("va", 2 ) kodu ilk 2 karakterden soraki stringi bakar ve o Stringin  "va" ile baslayip baslamadigini konterol edr.
        // "va" ile basliyorsa true baslamiyorsa false  RETURN EDER
        boolean b = a.startsWith("va",2);
        System.out.println(b);
        // replaceFirst("a", "*"); kod String deki ilk a yi * e cevirir
        //replace("a", "*"); kod Stringdeki tum a lari * ceviri
        String c = a.replaceFirst("a","*");
        System.out.println(c); //j*va kolaydir

        // concat() methodu iki stringi birbirine yapistirmaya yapar
        // Connatination islemi iki turlu yapabilabilir 1) + ile 2) concat() ile
        // java bir islem icin method yaptiysa o methodu kullanmak best practice dir.
        String d = a.concat("Anladin mi");
        System.out.println(d);// java kolaydir anladin mi

        //trim methodu bir stringin bas ve sonundaki space karakterilerini siler aradi space karakteri dokunmaz
        String e = "  Tom Hanks    ";
        String f = e.trim();
        System.out.println(f);


        String h = "Java";
        String i = "Java";
        // h.compareTo(i) kod iki Stringi alfabetik olarak karsilastirilir
        // buyuk kucuk harfa duyarlidir
        // buyuk harf kucuk harf duyarli olmasini istemiyorsak  compareToIgnoreCase kulaabilirz
        int k = h.compareTo(i);
        System.out.println(k);
        // repeat(3) kodu "a" Strinigini 3 kere yapistirir
        String n = a.repeat(3);
        System.out.println(n);




    }
}
