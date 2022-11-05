package day08stringmanipulation;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Example 1: Kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yazdırınız
        //           Ramazan ==> Rn

        System.out.println("Lütfen isminizi giriniz...");
        String isim = input.next();
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length()-1);//Yazdığınız code sadece bazı durumlar için çalışırsa o code'a "Hard Coding" denir.
        //Yazdığınız code sadece her durum için çalışırsa o code'a "Dynamic Coding" denir.
        System.out.println("" + ilkHarf + sonHarf);

        // 2.Yol.
        String ilk = isim.substring(0,1);
        String son =isim.substring(isim.length()-1);
        System.out.println(ilk + son);



        // Example 2: Verilen Stingdeki sadece hayvan isimlerini yazdiriniz

        // ben kedi esim tavuk oglum inek secer

        String str = "Ben kedi, esim tavuk,oglum sever inek";
        String kedi = str.substring(4, 8);
        String tavuk = str.substring(15, 20);
        String inek = str.substring(34);
        System.out.println(kedi + tavuk + inek);

        //Example 3: Ilk isim ve soy isimi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdiriniz
        //           Ali Can ==> AC       Tahsin Yurdakul ==> TY
        System.out.println("Ilk ve soy isminizi giriniz");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0, 1);
        String b = tamIsim.split(" ")[1].substring(0, 1);
        System.out.println(a + b);











    }
}
