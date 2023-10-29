package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,45,3443,785,-99};
        System.out.println(findnumbers(nums));
        System.out.println(digits2(-34566764));
    }

    static int findnumbers(int[] nums){
        int count=0;
        for(int num : nums){
            if (even(num))
                count++;
            }
        return count;
    }
    static boolean even(int num){
        int numberofdidgits = digits(num);
        return numberofdidgits % 2 == 0;
    }

    static int digits2(int num){
        if(num<0)
            num=num*-1;
        return (int)(Math.log10(num)) + 1;
    }
    static int digits(int num){
        if(num<0)
            num=num*-1;

        if(num==0)
            return 1;

        int count = 0;

        while (num>0) {
            count++;
            num=num/10;
        }
        return count;
    }
}
