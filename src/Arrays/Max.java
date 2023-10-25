package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 56, 42, 66, 678, 21};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 2));
    }

    static int maxRange(int[] arr, int start, int end){
        int max = arr[start];
        for(int i=start ; i<=end ; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
