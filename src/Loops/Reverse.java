package Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        while (n!=0){
            int rem = n % 10;
            res = res*10 + rem;
            n=n/10;
        }
        System.out.println(res);
    }
}
