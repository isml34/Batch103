package day18arraylistspassbyvalue;

public class Varrargs01 {
    /*
    1) Farkli sayilardaki parametrelerle calisabilen bir method olusturmak
    istiyorsaniz "varags" kullanmalsizin
    2) "Varargs arka tarafta ARRAY kullanir bu yuzden varargs lalara calisabilen Array lerle calisiyormus gibi
    davranabilirsiniz
    3) Vararag olusturmak icim <datatye> ,,, <varangs ismi>
    4) Bir methoda Varargsin yaninda  baska bir parametre kulanilabilir mi?
    5) Varargslarla baska parametre kullaniliri en basta kulanilmak sartiyla
     */
    public static void main(String[] args) {
       int r1 = add(2, 3);
        System.out.println(r1);
        int r2 = add(2, 3, 4);
        System.out.println(r2);

    }

        //Iki sayinin toplamini return eden  bir method olusturunuz?
//        public  static int add ( int a,int b){
//            return a + b;

//        }
    // Uc sayinin toplamini return eden  bir method olusturunuz?
//        public  static int add ( int a,int b, int c) {
//            return a + b + c;
//        }
    // Uc sayinin toplamini return eden  bir method olusturunuz?
//    public  static int add ( int a,int b, int c, int d) {
//        return a + b + c + d;

//    }
    // Istedigimiz sayiya kadar toplayacagimiz bir metoth olusturalim

    public static int add (int... a){
        int sum =0;

        for (int w : a) {
            sum = sum+w;

        }
        return  sum;

    }




}
