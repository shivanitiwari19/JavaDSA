package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 5, 4, 6, 7, 5, 9, 0, 10);
        multiple(2, 4, "Shivani", "Saakshi");
    }

    static void multiple(int a, int b, String ...v){
        // in case of mixed argument types, varargs always come at the end.

        System.out.print(a + ", " + b + ", ");
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v) {                 // it internally stores the numbers into an integer array.
        System.out.println(Arrays.toString(v));
    }
}
