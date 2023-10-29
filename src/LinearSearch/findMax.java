package LinearSearch;

import java.util.Arrays;

public class findMax {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4},
                {45, 3, 76, 3},
                {2, 4, 98},
                {67, 44}
        };
        int max = searchMax(arr);
        System.out.println(max);
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
