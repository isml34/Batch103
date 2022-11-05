package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
       int i =1;
       while (i<1){
           System.out.println("While loop");
           i++;

       }

             //do-while loop kullandığınızda loop bodysi içindeki kod en az 1 kere çalışır
             //yani do-while loop için "zero execution" mümkün değildir
             //Hareket eder ==> Düşünür
       int k= 1;
       do {
           System.out.println("Do while loop");
           k++;
       }
           while (k<1);

           // EX2

        double num = 24.5673;
        System.out.println(num);


        String str = String.valueOf(num);
        System.out.println(str);
        ///regex icin nokta kullandiginizda onune\\ koyunuz
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);
        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);
        int sum =0;
        do {

            sum = sum+ decimalInt%10;
            decimalInt= decimalInt/10;

        }while (decimalInt>0);
        System.out.println(sum);








    }
}
