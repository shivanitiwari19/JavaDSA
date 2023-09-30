package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int EmpID = in.nextInt();
        String dept = in.next();
        switch (EmpID) {
            case 1 -> System.out.println("Shivani");
            case 2 -> System.out.println("Vaishnavi");
            case 3 -> {
                System.out.println("Samriddhi");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "HR" -> System.out.println("HR Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter valid EmpID");
        }
    }
}
