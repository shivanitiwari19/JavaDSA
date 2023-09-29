package com.First;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        System.out.print("Enter Principal: ");
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        System.out.print("Enter Rate: ");
        int r = input.nextInt();
        System.out.print("Enter Time (in years): ");
        int t = input.nextInt();
        float SI = p*r*t /100;
        System.out.println("The Simple Interest is: "+SI);
        float total = p+SI;
        System.out.println("The Principal Amount becomes: "+ total);
    }
}

