package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
        System.out.print("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for(int i = 0 ; i< arr.length ; i++){
            swapped = false;
            // for each step, max item will come at the last respective order
            for (int j = 1 ; j < arr.length - i ; j++){
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
