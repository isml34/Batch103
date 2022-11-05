package day26exceptions;

public class Exceptions03 {
    public static void main(String[] args) {
        double d = divideStringByTheNumOfTheChar(null);
        System.out.println(d);

        divideStringByTheNumOfTheChar(null);

    }

    //String'deki character sayisini bulunuz, String'i integer'a ceviriniz, Integer'i character sayisina bolunuz.
    public static double divideStringByTheNumOfTheChar(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException: "null" String ile "length()" kullanildiginda alinir
            i = Integer.valueOf(str);//NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
            sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir
        }catch(NullPointerException e){
            System.out.println("==> " + e.getMessage());
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }

    public static double divideStringByTheNumOfTheCharacter(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {

            length = str.length();//NullPointerException: "null" String ile "length()" kullanildiginda alinir
            i = Integer.valueOf(str);//NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
            sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }
    public static double divideStringByTheNumOfTheCharacters(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {

            length = str.length();//NullPointerException: "null" String ile "length()" kullanildiginda alinir
            i = Integer.valueOf(str);//NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda
            sonuc = i / length;//ArithmeticException: Bolen sayi sifir oldugunda alinir

        }catch(NullPointerException e){
            System.out.println("NulPointera ozel...");
        }catch (Exception e){
            System.out.println("Diger tum exceptionlar icin");
        }
        return sonuc;
    }
    /*
    Note: 1) Aralarında "parent-child" relationship olan Exception Class'ları multiple catch'lerde kullanmak isterseniz
             "child" olan önce kullanılmalıdır, aksi takdirde hata verir.
          2) Aralarında "parent-child" relationship olmayan Exception Class'ları multiple catch'lerde kullanmak isterseniz
             sıralamanın bir önemi yoktur.

 */

}
