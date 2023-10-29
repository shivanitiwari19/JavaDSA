package LinearSearch;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {10, 18, 56, 89, -2, 0, 34, 6};
        int target = 0;
        System.out.println(RangeSearch(arr, target, 1, 4));
    }


    static int RangeSearch(int[] arr, int target, int beg, int end) {
        if (arr.length == 0)
            return -1;


        for (int i = beg; i < 4; i++) {
            int element = arr[i];
            if (element == target)
                return i;
        }

        // if none of the above conditons satisfy, then element not found.
        // return -1 because it can never be an index value.
        return -1;
    }
}
