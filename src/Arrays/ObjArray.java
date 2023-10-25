package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ObjArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0 ; i < str.length ; i++){
            str[i] = in.next();                    // it will take character as well as string input.
        }
        System.out.println(Arrays.toString(str));

        str[3] = "Saakshi";
        System.out.println(Arrays.toString(str));
    }
}
