package Conditionals;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int lar;
        if (a > b && a > c){
            lar = a;
        }
        else if (b > a && b > c){
            lar = b;
        }
        else {
            lar = c;
        }
        System.out.println("The largest of the three numbers is: "+lar);
    }
}
