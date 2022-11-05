package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {

             //If it rains I will cancel the picnic
            //if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

            //Example 1: Sayi pozitif ise ekrana pozitif yazdirin.
            int s = 12;
            if(s>0){
                System.out.println("Positive");
            }

            //Example 2: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdirin

              /*


              Bir tane false varsa sonuc false demektir.

        And işlemi: && işlemidir. Sadece boolean ile kullanılabilir. "True" olabilmesinin tek yolu iki işlemde doğru olmalıdır.
         Note:      && = and   islemi sadece boolean ile kullanılır.

                    true && true = true
                    true && false = false
                    false && true = false
                    false && false = false
              */
        //Example 3: Verilen bir sayi uc basamakli ise ekrana "Uc basamakli yazdiriniz"


        int n = -123;
        n = Math.abs(n);
        if(n>99 && n<1000) {
            System.out.println("Uc basamakli");



        }
//        ex3
        int d = 566;
        if(d%2 ==0){
            System.out.println("Cift sayi");

        }
        int p = -18;
        p= Math.abs(p);
        if (p%2==0){
            System.out.println("Cift sayi");
        }


    // ex5 verilen sayi 300den kucuk 1200 den kucuk ise Harika sayi yazin
        /*
    Note: veya  =  ||
           sadece boolean lar ile kullanılır.

              true || true = true
              false || true = true
              true || false = true
              false || false = false
               Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
                 || isleminde sadece bir tane true sonucu true yapmaya yeter
 */


        int r = 250;
        if (r<300 || r>1200){
            System.out.println("Harika sayi");
        }


    }
}
