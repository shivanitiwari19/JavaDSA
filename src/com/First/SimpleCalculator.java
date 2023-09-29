package com.First;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        int num1 = input.nextInt();
        System.out.print("Enter second operand: ");
        int num2 = input.nextInt();
        System.out.print("Enter the operator: ");
        char op = input.next().charAt(0);
        System.out.print("The output is: ");
        if (op=='+'){
            System.out.println(num1+num2);
        } else if (op=='-'){
            System.out.println(num1-num2);
        } else if (op=='*') {
            System.out.println(num1*num2);
        } else if (op=='/') {
            System.out.println(num1/num2);
        } else if (op=='%') {
            System.out.println(num1%num2);
        } else {
            System.out.println("Invalid Entry.");
        }
    }
}
