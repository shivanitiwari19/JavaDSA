package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        //Or

        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Input

        for ( int row = 0 ; row < arr.length ; row++){
            // for each col in every row
            for (int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = in.nextInt();
            }
        }

        // output
        for (int row = 0 ; row < arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
