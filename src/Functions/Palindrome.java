package Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        Check(num);
    }

    static void Check(int n) {
        int m = n;
        int rev = 0;
        while (n!=0) {
            int r = n % 10;
            rev = rev*10 + r;
            n = n / 10;
        }
        if(rev == m)
            System.out.println("The number is a Palindrome.");
        else
            System.out.println("The number is not a Palindrome.");
    }
}
