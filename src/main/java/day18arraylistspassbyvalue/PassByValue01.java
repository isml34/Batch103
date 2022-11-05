package day18arraylistspassbyvalue;

public class PassByValue01 {
    /*
    1) JAVA  variablelari orginal degerleri  korumak ister
    2) Variable methodlar icinde kullanildiginda Java methodun icine original degeri koymaz o degerin  kopyasini kulanir
    method kopya ustunde degisiklik yapar dolaysiyla variablein original deger korumus olur
    Bu sisteme "Pass By Value" denir.

    NOTE: Java " Pass By Value" kullanir
    NOTE: Bazi programa dilleri original degeri koruma altina almistir. Bu isi developerlara birakmistir
          Bu tarz dilleri "Pass By Reference" kullanir.

     */
    public static void main(String[] args) {
        int x = 5;
        // Statik method olan main method un icindeki gersey
        // static olmalidir
        change(5);
        System.out.println(x);
        int ucret =100;
        ucret = indirim(ucret);

        //int kopya = indirim(ucret);
       // System.out.println(kopya);
        System.out.println(ucret);
    }
    public static void change (int a){
        System.out.println(a*3);
    }
    // Void disindaki "return" type larda method bodysi icinde
    //return keyword kullanilmalidir.
    public static int indirim (int gomlekUcreti){
        return gomlekUcreti - 10;
    }
}
