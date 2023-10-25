package Arrays;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }

    // Arrays are mutable in Java. Here, a copy of nums array was sent into the change function but sice both of these point to
    // the same entity, a change in one of them is also visible in the other one.
}
