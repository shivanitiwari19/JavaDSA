package Functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(armstrong(num));
        threedigits();
    }

    static boolean armstrong(int n) {
        int num = n;
        int sum = 0;
        int rem;

        while (n != 0) {
            rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        return sum == num;
    }

    static void threedigits() {
        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}