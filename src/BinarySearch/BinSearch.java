package BinarySearch;

import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] arr = new int[m];
        for (int i=0 ; i<arr.length ; i++){
            arr[i] = in.nextInt();
        }
        int key = in.nextInt();
        int ans = BinarySearch(arr, key);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            //because it might be tha case that while dealing with large arrays the limits of integer may be crossed

            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
