package Switch;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
