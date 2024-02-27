//* * * * *
//* * * *
//* * *
//* *
//*

package Patterns;
public class Pattern3 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int i = 1 ; i <= n ; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
