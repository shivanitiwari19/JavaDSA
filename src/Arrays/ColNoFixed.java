package Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 5, 7},
                {5, 6, 7},
                {5, 9, 8, 6}
        };

        for (int row = 0 ; row < arr.length ; row++){
            for (int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
