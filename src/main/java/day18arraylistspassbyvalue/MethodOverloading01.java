package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    /*
    Method Overloading naisl yapmalidir?
    1) Method isimleri ayni olmalidir
    2) Method parametreleri farkli olmalidir
      i) Parametre sayilari degistirebilir
      ii)Parametre data tiplerini degistirebilirsiniz
      iii) Parametre yerlerini degistirebilirsiniz ancak data
           tipleri farkli ise
     3) Methodu Ismi + Parametreler= Method Signichure
         Method Signature disinda ne degistirirseniz degistirin
         Java o methodlari farkli kabul etmez.
     */
    public static void main(String[] args) {
        add(3,5);
        add(3,5.0);

    }
    public  static void add(int a, int b){
        System.out.println(a+b);

    }
    public  static void add(int a, int b, int c){
        System.out.println(a+b+c);

    }
    public  static void add(int a, double b ){
        System.out.println(a+b);

    }
    public  static void add(double a, int b ){
        System.out.println(a+b);

    }
}
