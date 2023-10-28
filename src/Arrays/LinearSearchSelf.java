package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class LinearSearchSelf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0 ; i<arr.length ; i++){
            arr[i] = in.nextInt();
        }
        int max=arr[0];
        for (int i=0 ; i<arr.length ; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
