package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
//              byte < short < int < long < float < double

//Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
//Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir


    public static void main(String[] args) {
        byte age = 23;
        int newAge = age;
        long population = 1234;
        int newPopulation = (int)population;
        //12 ===> Java ondalik sayiyi, tam sayiya cevirirken yuvarlama işlemi yapmaz.
        //        Java ondalik sayiyi,tam sayiya cevirirken ondalık kismini siler.




        int numer = 515;
        byte newNumber = (byte)numer;
        System.out.println(newNumber);//3 ===> Java 515'i 256(byte daki sayiların sayisi) ya boldu kalani return etti.


        int num = 510;
        byte newNum = (byte) num;
        System.out.println(newNum);//-2






    }


}
