package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        fact(num);
    }

    static void fact(int n) {
        int f = 1;
        while (n!=0) {
            f = f * n;
            n--;
        }
        System.out.println("Factorial = "+ f);
    }
}
