package day26exceptions;

public class Exceptions03 {
    public static void main(String[] args) {
       double d = divideStringByTheNumOfChar("124");
        System.out.println(d);


    }
    //String'deki character sayisini bulunuz, String'i integer'a ceviriniz, Integer'i character sayisina bolunuz.
    public static double divideStringByTheNumOfChar(String str){
        int length = str.length();
        int i = Integer.valueOf(str);
        return i/length;


    }


}
