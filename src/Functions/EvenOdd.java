package Functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        Check(n);
    }

    static void Check(int num) {
        if (num % 2 ==0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");
    }
}
