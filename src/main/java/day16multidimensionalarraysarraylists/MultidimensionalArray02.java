package day16multidimensionalarraysarraylists;

public class MultidimensionalArray02 {
    public static void main(String[] args) {
        //Bir multidimensional array deki en buyu elemanin toplamini veren kodu yaziniz

        int arr[][] = {{2, 5, 1},{83, 75}};
        int max = arr[0][0];

        for (int[] w: arr){
            for (int k : w){
                max = Math.max(max, k);
            }
        }
        System.out.println(max);

        int min = arr[0][0];

        for (int[] w: arr){
            for (int k : w){
               min = Math.min(min, k);
            }
        }
        System.out.println(min);
        System.out.println(max+min);



    }
}
