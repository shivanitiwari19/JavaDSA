package Loops;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();       //number
        int k = in.nextInt();       //number to count
        int count = 0;
        while (n!=0){
            int rem = n%10;
            if (rem == k){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
