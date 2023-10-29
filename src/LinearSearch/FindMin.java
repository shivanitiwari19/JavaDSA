package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {34, 23, 5, 2, 7, 9};
        System.out.println(Min(arr));
    }

    static int Min(int[] arr){
        int m=arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<m)
                m=arr[i];
        }
        return m;
    }
}
