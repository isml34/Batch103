package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        //Example 1: Bir integer ArrayListeki 7 haric tum elemanlari 2 artiriniz

        List<Integer> agges = new ArrayList<>();
        agges.add(12);
        agges.add(7);
        agges.add(21);
        agges.add(78);
        agges.add(9);
        for (Integer w: agges) {
            if ( w==7){
                continue;
            }
           // w = w+2; Listler boyle update edilemezler
           agges.set(agges.indexOf(w), w+2);
        }
        System.out.println(agges);


        //EX 2: Size verilen A rrayListe8 ve 8 (inclusive) den onceki tum elemanlari iki katina cikariniz

        List<Integer> nums = new ArrayList<>();
       nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);
        for (Integer w: nums){
            nums.set(nums.indexOf(w), w*2);
            if (w == 8){
                break;
            }

        }
        System.out.println(nums);



    }
}
