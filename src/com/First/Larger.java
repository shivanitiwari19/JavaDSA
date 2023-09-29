package com.First;

import java.util.Scanner;

public class Larger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = input.nextInt();
        if (a>b) {
            System.out.println("Larger one is: "+a);
        } else {
            System.out.println("Larger one is: "+b);
        }
    }
}