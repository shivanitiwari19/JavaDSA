package com.First;

import java.util.Scanner;

public class FirstJavaAssignments {
    public static void main(String[] args) {
        System.out.println("What is your name? ");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        System.out.println("Hello, "+s1+"!");
    }
}

