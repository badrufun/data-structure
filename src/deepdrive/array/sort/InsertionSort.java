package deepdrive.array.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        /*
         * Time complexity is approximately O(n^2) --> This is quadratic algo
         * Memory complexity is almost same as n for n elements
         *
         * If the input array is nearly sorted then not much shifting require and
         * it will be working like linear. So next one is **************ShellSort************
         *
         * Stable Algorithm
         *
         */
    }

    private static void sort(int[] arr) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            if (arr[firstUnsortedIndex - 1] > arr[firstUnsortedIndex]) {
                int firstUnsortedElement = arr[firstUnsortedIndex];
                arr[firstUnsortedIndex] = arr[firstUnsortedIndex - 1];

                int i;
                for (i = firstUnsortedIndex - 1; i > 0 && arr[i - 1] > firstUnsortedElement; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[i] = firstUnsortedElement;
            }
        }

        /*for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int firstUnsortedElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > firstUnsortedElement; i--){
                arr[i] = arr[i - 1];
            }
            arr[i] = firstUnsortedElement;
        }*/
    }
}
