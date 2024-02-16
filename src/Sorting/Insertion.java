package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.print("After Sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertion(int[] arr){
        for(int i=0 ; i < arr.length -1 ; i++){
            for(int j=i+1 ; j>0 ; j--){
                if(arr[j] < arr[j-1])
                    swap(arr, j, j-1);
                else
                    break;
            }
        }
    }
}
