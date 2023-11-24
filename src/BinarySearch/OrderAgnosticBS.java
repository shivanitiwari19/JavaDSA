package BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i<size ; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(OABS(arr, target));
    }

    static int OABS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[0] < arr[arr.length-1];

        while(start<=end) {
            int mid = start + (end-start)/2;
            //because it might be tha case that while dealing with large arrays the limits of integer may be crossed

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
