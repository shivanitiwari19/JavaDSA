package LinearSearch;

import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr ={
                {2, 3, 4},
                {45, 3, 76, 3},
                {2, 4, 98},
                {67, 44}
        };
        int target = 55;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0; j<arr[i].length ; j++){
                if(arr[i][j]==target)
                    return new int[]{i, j};
            }

        }
        return new int[] {-1,-1};
    }
}
