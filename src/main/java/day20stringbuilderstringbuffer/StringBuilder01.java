package day20stringbuilderstringbuffer;

public class StringBuilder01 {

    /*
   1)"StringBuilder" Java'da bir Class'dır
   2)"StringBuilder", String oluşturmaya yarar
   3)"String" Class varken niçin "StringBuilder"a ihtiyaç duyarız?
       Çünkü "String" Class "Immutable Class"dır, ama bazen biz "Mutable String" lere ihtiyaç duyarız.
       StringBuilder bize "Mutable String" verir.
   4)"Immutable Class" larda var olan değer değiştirilemez. Siz var olan bir değeri değiştirmek istediğinizde
         i)Memory'de yeni bir variable yeni değerle oluşturulur
         ii)Eski variable'ın pointer'ı yeni variable'a döndürülür.
         iii)Eğer bir variable'ı hiç bir pointer göstermiyor ise o variable "Garbage Collector" tarafından silinir.

         "Mutable Class"larda var olan değer değiştirilebilir. Orijinal değer korunmaz.
  5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
    Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin bu container'i
    kullanmasini temin eder. Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
    etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variablee'in
    degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
    yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.
 */
    public static void main(String[] args) {

        String str ="Java";
        str="Super Java";
        System.out.println(str);

        //StringBuilder nasil olusturulur ?

        //1.Yol:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);

        //2.Yol:
        StringBuilder strb2 = new StringBuilder();
        //Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);
        //Yol b:
        strb2.append(" learn").append(" Java earn").append(" MONEY");
        System.out.println(strb2);

        //Stringbuilder'larda character sayisi nasil bulunur?

        StringBuilder strb3=new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");
        int numOfChar=strb3.length();
        System.out.println(numOfChar);//18

        //capacity asimlarinda capacity var olanin iki katinin iki fazasina cikar
        int capacity=strb3.capacity();

        System.out.println(capacity);//34

        //set.charAt(2,'r') > Index 2 deki characteri 'r' ye cevirir.
        strb3.setCharAt(2,'r'); //Carxxxxxxxxxxxxxxx
        System.out.println(strb3);

        //delete(3,18) index 3 dahil,index 18 haric uzere arada ki tum characterleri siler. (subString gibi)
        strb3.delete(3,18);
        System.out.println(strb3);//Car

        //delete.charAt(2) index 2 deki characteri siler.
        strb3.deleteCharAt(2);
        System.out.println(strb3);

        //reverse() methodu StringBuilder'i ters cevirir. > Ali --> ilA
        //"mutable" larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir.
        strb3.reverse();
        System.out.println(strb3);//maC

        //"Immutable"larda orjinal degeri degistrmek icin methodu kullanmak yeterli olmaz. Birde atama yapmalisiniz.
        String abc= "Java";
        abc.replace("a","i");
        System.out.println(abc);//Java ==> atama yapilmazsa degismez,eski deger gorulur.

        //toString() method'u StringBuilder'lari String'e cevirir
        String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //String'den de StringBuilder'a asagidaki gibi donebilirsiniz
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3, "XXXX"); 3. character den sonra "XXXX" leri koyar
        strb4.insert(3, "XXXX");
        System.out.println(strb4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3, "KLMOPQRSTU", 5, 8); ==> 3. charater'den sonra, "KLMOPQRSTU" String'inin index 5, 6, 7 deki character'lerini yerlestirir
        strb4.insert(3, "KLMOPQRSTU", 5, 8);
        System.out.println(strb4);//mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        StringBuilder a = new StringBuilder("Iava");
        StringBuilder b = new StringBuilder("Java");

        //a.compareTo(b) method'u i)StringBuilder'lar tamamiyla ayni ise 0 verir.
        //                        ii)"a" alfabetik sirada "b" den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //                        iii)"a" alfabetik sirada "b" den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir
        int sonuc = a.compareTo(b);
        System.out.println(sonuc);

    }
}
