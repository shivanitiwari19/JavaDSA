package Loops;

import java.util.Scanner;

public class ProductminusSum {
    public static void main(String[] args) {
        int dig, sum=0, prod=1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        while (num!=0){
            dig = num % 10;
            sum = sum + dig;
            prod = prod * dig;
            num = num/10;
        }
        System.out.print("Result is: "+(prod-sum));
    }
}
