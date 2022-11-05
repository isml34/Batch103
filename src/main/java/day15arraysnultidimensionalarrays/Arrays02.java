package day15arraysnultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 1: Size verilen posotove ve negative sayilar iceren bir integer array deki en buyuk negative ve en kucuk pozitive elemani bulunuz.

        int arr[] = {-12, 18, -5, 23, -2, 0};
        Arrays.sort(arr);

        int maxNegative = arr[0];

        int minPositive = arr[arr.length-1];
        for (int w: arr){

            if (w<0){
                maxNegative = Math.max(maxNegative, w);
            }
            if (w>0){
              minPositive =  Math.min(minPositive, w);
            }

        }
        System.out.println(maxNegative + " / " + minPositive);


    }
}
