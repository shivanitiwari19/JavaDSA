package Functions;

import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int m = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int n = in.nextInt();
        Print(m , n);
    }

    static void Print(int m, int n) {
        for (int i = m ; i<=n ; i++) {
            int c = 0;
            for (int j = 1 ; j<=i ; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c==2)
                System.out.print(i+ " ");
        }
    }
}
