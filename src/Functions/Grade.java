package Functions;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int n = in.nextInt();
        Check(n);
    }
//    91-100         AA
//    81-90          AB
//    71-80          BB
//    61-70          BC
//    51-60          CD
//    41-50          DD
//    <=40          Fail

    static void Check(int num) {
        if (num<=100 && num>=91)
            System.out.println("AA");
        else if (num<=90 && num>=81)
            System.out.println("AB");
        else if (num<=80 && num>=71)
            System.out.println("BB");
        else if (num<=70 && num>=61)
            System.out.println("BC");
        else if (num<=60 && num>=51)
            System.out.println("CD");
        else if (num<=50 && num>=41)
            System.out.println("DD");
        else
            System.out.println("Fail");
    }
}
