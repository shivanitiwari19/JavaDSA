package Recursion;

public class NumberExNew {
    public static void main(String[] args) {
        // first function call
        print(1);
    }

    static void print(int n){
        // base condition
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // Recursive function call
        // also called tail recursion, because this is the last function call.
        print(n+1);
    }
}