package Recursion;

public class NumbersEx {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5
        print(1);
    }

    static void print(int n){
        System.out.println(n);
        print1(2);
    }
    static void print1(int n){
        System.out.println(n);
        print2(3);
    }
    static void print2(int n){
        System.out.println(n);
        print3(4);
    }

    // func body is changing here
    static void print3(int n){
        System.out.println(n);
    }
}
