package Functions;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        isPrime(num);
    }

    static void isPrime(int n){
        int c=0;
        for (int i=1 ; i<=n ; i++){
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            System.out.println("The number is Prime.");
        else
            System.out.println("The number is not Prime.");
    }
}
