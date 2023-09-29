package Conditionals;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        System.out.print("Enter salary: ");
        Scanner input = new Scanner(System.in);
        int sal = input.nextInt();
        if (sal > 10000) {
            sal = sal + 2000;
        }
        else if (sal > 20000){
            sal += 3000;
        }
        else {
            sal = sal + 1000;
        }
        System.out.println("Effective Salary is : "+ sal);
    }
}
