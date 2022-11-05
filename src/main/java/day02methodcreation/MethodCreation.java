package day02methodcreation;

public class MethodCreation {


    public static void main(String[] args) {
        // void: Bu method yeni bir data uretmiyor
        // Ornek. Ekrana bir sey yazdirma  methodu, bir tusa tiklama methodu gibi
        //Main method icinde kulanacaginiz her sey static olmalidir

        System.out.println(  toplamaYap(1.2,5));
        System.out.println(ucSayiCarp(2, 1.5,6));
        System.out.println(toplamaVeCarpmaYap(2,4,6));
       //sout yazip enter basiniz system.out.println otomatik gelir


        //ex Uc sayidan ilk ikisini toplayiniz ucuncu ile carpan bir method olusrup sonucunu ekrana yazdiriniz






    }
// Toplama islemi yapan bir method olusturunuz

    public static double toplamaYap(double a, double b) { return a+b;
    }

// ex2 Uc sayiyi birbiryile capan bir method olusturunuz

    public static double ucSayiCarp (double c, double e, double d){return c*e*d;

    }
    public static double toplamaVeCarpmaYap (double a,double b, double c){return (a+b)*c;
    }


}
