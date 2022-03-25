package deepdrive.array.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        /*
         * Time complexity is approximately O(n^2) --> This is quadratic algo
         * Memory complexity is almost same as n for n elements
         * Slightly better than Bubble sort. B'coz swapping is very less.
         *
         * Unstable sorting
         * */
    }

    private static void sort(int[] arr) {
        for (int lastIndex = arr.length -1; lastIndex > 0; lastIndex--){
            int maxNumIndex = 0;
            for (int j = 1; j < lastIndex; j++){
                if(arr[maxNumIndex] < arr[j]){
                    maxNumIndex = j;
                }
            }
            swap(arr, maxNumIndex, lastIndex);
        }
    }

    private static void swap(int[] arr, int i, int j){
        if(i != j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
