// https://leetcode.com/problems/missing-number/
// Amazon Question
package Leetcode;

class MissingNumber268 {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
            int i=0;
            while (i<arr.length) {
                if (arr[i]<arr.length && arr[i] != arr[arr[i]]) {
                    int temp = arr[i];
                    arr[i] = arr[arr[i]];
                    arr[arr[i]] = temp;
                } else
                    i++;
            }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }
}