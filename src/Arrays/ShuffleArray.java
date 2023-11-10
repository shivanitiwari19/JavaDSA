package Arrays;
import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];
        int j = nums.length/2;
        int s=0, m=j;
        int i=0;
        while(s<j && m<nums.length) {
            ans[i] = nums[s++];
            ans[i + 1] = nums[m++];
            i = i + 2;
        }
        return ans;
    }
}
