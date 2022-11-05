package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Gun numarasi giriniz...");
        byte gunNo = imput.nextByte();

        //1.Yol. if ile cozunuz
        if (gunNo==1){
            System.out.println("PAzar");
        } else if (gunNo==2) {
            System.out.println("Ptesi");

        } else if (gunNo==3) {
            System.out.println("Sali");

        } else if (gunNo==4) {
            System.out.println("Çarşamba");

        }else if (gunNo==5) {
            System.out.println("Perşembe");
        } else if (gunNo==6) {
            System.out.println("cuma");

        } else if (gunNo==7) {
            System.out.println("Ctesi");

        }else {
            System.out.println("lütfen 1 den 7ye kadar bir rakam giriniz");

        }

        //2.Yol switc ile cozum
        switch (gunNo){
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;case 4:
                System.out.println("Carsamba");
                break;case 5:
                System.out.println("Persembe");
                break;case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Gecerli gun sayisi giriniz");

        }



    }
}
