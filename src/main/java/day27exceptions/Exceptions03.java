package day27exceptions;
/*
    1)Java Exception'lar oluşturarak Developer'ların Java kurallarına uymalarını temin etmiştir.
    2)Biz de Application üretirken kendi Exception'larımızı oluşturarak diğer Developer'ların bizim ortaya koyduğumuz kurallara uymalarını temin ederiz.
    3)Java'nın değil, bizim ürettiğimiz Exception'lara "Custom Exception" denir.
    4)Custom Exception'lar da "RuntimeException" ve "CompileTimeException" olabilir.
    5)Custom "RuntimeException" üretmek için "extends RuntimeException" deriz.
    6)Custom "CompileTimeException" üretmek için "extends Exception" deriz
 */

public class Exceptions03 {
    public static void main(String[] args) throws IllegalGradeException {

        printGrades(90);
        //Ogrenci notlarini yazdiran bir method olusturunuz

        checkNameFormat("Ali");
    }
    public static void printGrades(double grade) throws IllegalGradeException {

        if (grade<0 || grade>100){
            throw new IllegalGradeException("Grade 0 dan az 100 den cok olamaz");
        }else {
            System.out.println(grade);
        }

    }

    public static boolean checkNameFormat(String name){
        if (name.charAt(0)>='A'&& name.charAt(0)<='Z'){
            return true;
        }else {
            throw new IllegalNameException("Isimler buyuk harfle baslamalidir");
        }
    }

}
