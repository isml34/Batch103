package day02methodcreation;

import java.sql.SQLOutput;

public class Car {
    public String marka = "Honda";
    public int fiyat = 20000;

    /*
   Note: Class== Varisble == Kullancagiz
                  Method






     */






    public static void main(String[] args) {

        // obcect nasil olusturulur
        //class ismini yaziniz, 2 objeye isim veriniz, 3 =,   4 new keywordunu kullan, 5 class ismi parantezle beraber
       Car                     myHonda                 =            new                      Car();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
        myHonda.dur();




        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));

    }
    public void hareketEt(){
        System.out.println("Honda guzel hareket eder....");
    }
public void dur() {
    System.out.println("Honda guvenli durur....");
}



}
