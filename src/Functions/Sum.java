package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();     //function call
//        int ans = sum2();                   // the return value gets stored into the reference variable ans.
//        System.out.println(ans);
        int ans = sum3(3,5);
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;                            // this returns the integer value of sum into the function
        /* end of function */
    }
    static void sum () {                       //void is used when we don't want to return anything.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

    }
//    access modifier (we'll look in OOP') return_type name() {
//        // body
//        return statement;
//    }
}
