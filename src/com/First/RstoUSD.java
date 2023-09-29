package com.First;

import java.util.Scanner;

public class RstoUSD {
    public static void main(String[] args){
        Scanner curr = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        float INR = curr.nextFloat();
        float USD = (float) (INR * 0.012);
        System.out.println(INR+" Rs in USD is: "+USD);
    }
}
