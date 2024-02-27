//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*

package Patterns;
public class Pattern5 {
    public static void main(String[] args) {
        patt(5);
    }

    static void patt(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Printing the lower half of the pattern
        for(int i = 1 ; i <= n ; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
