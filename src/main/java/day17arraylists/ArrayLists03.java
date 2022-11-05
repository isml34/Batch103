package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        //Example 1: Bir Liste'deki elemanlarin birbirine en yakin olan ikisini bulunuz.
        //              {12,19,15,30,21} ==> 19 ve 21

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);
        Collections.sort(a); //listeki elemanlari kucukten buyuge dizebilmek icin kullanilir.
        System.out.println(a);
        int minFark = Integer.MAX_VALUE;
        for (int i =1; i<a.size(); i++){
            minFark = Math.min(minFark, a.get(i)-a.get(i-1));
        }
        System.out.println(minFark);
















    }
}
