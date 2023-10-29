package LinearSearch;

public class Search {
    public static void main(String[] args) {
        int[] arr = {23, 33, 56, 44, 89, 19, 0, -1, -10};
        int target = 56;
        int ans = linearsearch(arr, target);
        System.out.println(ans);
    }

    // search in the array: return the element if found.
    // otherwise if item not found return -1

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;


        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target)
                return i;
        }

        // if none of the above conditons satisfy, then element not found.
        // return -1 because it can never be an index value.
        return -1;
    }
}
