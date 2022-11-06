package day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        double r1= compareNumOfCharacters("Java","xy");
        System.out.println(r1);
        double r2 = compareNumOfCharacters(null, "xy");
        System.out.println(r2);

        double r3 = compareNumOfCharacters("Selenium", "");
        System.out.println(r3);


    }
    // verilen iki String'den birinin karakter sayisinin digerinin kac kati oldugunu veren method olusturunuz

    public static double compareNumOfCharacters(String s,String t){
        double result = 0;

        try {
        result = s.length()/t.length();
        }catch (NullPointerException e){
            System.out.println("length methodu null ile kullanilamaz");

        }catch (ArithmeticException e){
            System.out.println("Herhanbi bir sayi sifir ile bolunemez");
        }finally {
            {
                System.out.println("Data base ile connection kesildi");
            }
        }
        return result;
    }

}
