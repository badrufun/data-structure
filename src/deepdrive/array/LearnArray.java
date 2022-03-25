package deepdrive.array;

public class LearnArray {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        //search for 7 in array
        int index = searchElement(intArray, 7);
        System.out.println("Number 7 is at index : " + index);
        /*
            retrieval:
                Index is known O(1) --> Always (base m/r + index * size of data store) constant time
                Index is unknown O(n) --> Always consider worst case. Linear time complexity
                Insert at specific index O(n) --> Worst case need to shift all n elements
                Update at specific index O(1) --> Over ride value at given index
                Delete with null value update O(1) --> Delete value at given index and place null
                Delete by shifting element O(n) --> Worst case need to sift all n elements
        */
    }

    public static int searchElement(int [] arr, int element){
        for (int i = 0; i < arr.length; i ++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
