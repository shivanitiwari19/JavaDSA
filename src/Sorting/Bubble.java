package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int [] arr = {5,6,3,8,5,0,2};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr){
        // run the steps n-1 times
        for(int i = 0 ; i< arr.length ; i++){
            // for each step, max item will come at the last respective order
            for (int j = 1 ; j < arr.length - i ; j++){
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
