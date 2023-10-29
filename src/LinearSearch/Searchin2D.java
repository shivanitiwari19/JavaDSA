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
        int target = 44;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        int max=searchMax(arr);
        System.out.println(max);
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

    static int searchMax(int[][] arr){
        int max = arr[0][0];
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0; j<arr[i].length ; j++){
                if(arr[i][j]>max)
                    max=arr[i][j];
            }
        }
        return max;
    }
}
