package day03typecastingwrapperscanner;

import java.sql.SQLOutput;

public class WrapperClass01 {

    public static void main(String[] args){
        /*

Note: Java primitive'lere method'lar ekleyerek yeni bir yapı oluşturdu,
      bu yapıya "Wrapper Class" denir.

      Primitive         Wrapper
        byte      ==>    Byte
        short     ==>    Short
        **int       ==>    Integer
        long      ==>    Long
        float     ==>    Float
        double    ==>    Double
        boolean   ==>    Boolean
        **char      ==>    Character



         */

        byte primitiveByte = 12;
        Byte wrapperByte = 12;
        //"primitiveByte" yazip nokta koydugunuzda hic method goremezsiniz, cunku primitive'ler method icermez sadece deger icerir
        //"wrapperByte" yazip nokta koydugunuzda bir cok method gorursunuz, cunku "wrapper" lar method icerir


        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //Example 2: short, int, long data type'larinin en buyuk ve en kucuk degerlerini ekrana yazdiriniz

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // primitiveler nasil "wrapper"lara cevrilir( Autoboxin)

        float f1 = 13.99F;
        Float wrapperF1 = f1;
//"wrapper"lar nasıl "primitive"lere çevrilir.(Unboxing)
        Character w1 = 's';
        char primitiveW1 = w1;

//Note: Autoboxing ve Unboxing Java tarafından otomatik olarak yapılır.




    }


}
