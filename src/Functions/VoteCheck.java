package Functions;

import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age: ");
        int n = in.nextInt();
        Check(n);
    }

    static void Check(int age){
        if (age >= 18)
            System.out.println("The person can vote.");
        else
            System.out.println("The person cannot vote.");
    }
}
