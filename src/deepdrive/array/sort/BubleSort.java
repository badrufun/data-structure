package deepdrive.array.sort;

import java.util.Arrays;

public class BubleSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(arr));

        /*
         * Time complexity is approximately O(n^2) --> This is quadratic algo
         * Memory complexity is almost same as n for n elements
         *
         * */
    }

    public static void sort(int[] arr){

        for (int lastIndex = arr.length -1; lastIndex > 0; lastIndex--){
            for (int j = 0; j < lastIndex; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j + 1);
                }
            }
        }
        //---------------2nd way------------------------
        /*for (int i = 0; i < arr.length -1; i ++){
            for (int j = 0; j < arr.length -1 -i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j + 1);
                }
            }
        }*/
    }

    private static void swap(int[] arr, int i, int j){
        if(i != j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
