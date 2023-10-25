package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr = new int[arr1.length + arr2.length];

        for(int i=0 ; i<arr1.length ; i++){
            arr1[i] = in.nextInt();
        }

        for(int i=0 ; i<arr2.length ; i++){
            arr2[i] = in.nextInt();
        }
        int j =0;
        for (int item: arr1) {
            arr[j++] = item;
        }
        for (int item: arr2) {
            arr[j++] = item;
        }
        System.out.println(Arrays.toString(arr));
    }
}
