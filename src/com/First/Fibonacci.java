package com.First;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner fib = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = fib.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("The fibonacci series is: ");
        System.out.print(a+" "+b);
        for (int i=2 ; i<n ; i++)
        {
            int c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}

