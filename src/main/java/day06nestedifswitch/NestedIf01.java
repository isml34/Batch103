package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        Password'un ilk harfi buyuk harf ise
        'A' olursa gecerli password aksi halde gecersiz password
        Password'un ilk harfi kucuk harf ise
        'z' olursa gecerli password aksi halde gecersiz password
         String pwd = "5xy12!";

        char ilkHarf = pwd.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){


            if(ilkHarf=='A'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }


        }else if(ilkHarf>='a' && ilkHarf<='z'){


            if(ilkHarf=='z'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }


        }else{

            System.out.println("Ilk karakter harf olmalidir");

        }


         */
        //Nested (kırmızı if ici mavi if) : Ic ice gecmis demektir (zigon sehpa misali)
        //Note: Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
        //      Bu yuzden mumkunse "nested" kod yazmamaya calisiriz.

        String pwd = "5xy12!";

        if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') {

            if (pwd.charAt(0) == 'A') {
                System.out.println("Gecerli password");
            } else {
                System.out.println("Gecersiz password");
            }

        } else if(pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){

            if (pwd.charAt(0)=='z'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz password");
            }

        }else {
            System.out.println("Ilk karakter harf olmalidir");
        }




    }
}
