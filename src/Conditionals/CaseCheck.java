package Conditionals;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        if (ch > 'a' && ch <='z') {
            System.out.print("Lower Case Alphabet");
        }
        else {
            System.out.print("Upper Case Alphabet.");
        }
    }
}
