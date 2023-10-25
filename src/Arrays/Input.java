package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 33;
        arr[2] = 45;
        arr[3] = 56;
        arr[4] = 21;
        System.out.println(arr[3]);

        // input using for loop

        for (int i=0 ; i<arr.length ; i++){
            arr[i] = in.nextInt();
        }

        // First way to print an array
        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        // Second way
        for (int i : arr) {                // for every element in array, print the element
            System.out.print(i + " ");     // here i represents element of the array
        }

        // Third way (Best one)
        System.out.println(Arrays.toString(arr));
    }
}
