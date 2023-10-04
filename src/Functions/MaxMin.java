package Functions;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = in.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = in.nextInt();
        int max = Max(a,b,c);
        int min = Min(a,b,c);
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }

    static int Max(int a, int b, int c) {
        if (a>b && a>c)
            return a;
        else if (b>a && b>c)
            return b;
        else
            return c;
    }

    static int Min(int a, int b, int c) {
        if (a<b && a<c)
            return a;
        else if (b<a && b<c)
            return b;
        else
            return c;
    }
}
