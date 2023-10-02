package Functions;

public class Overloading {
    public static void main(String[] args) {
        fun(34);             // it automatically goes to the first function with an integer parameter
        fun("Shivani");     // it automatically goes to the second function with the string parameter as argument.
        int ans =sum(50, 60, 10);
        System.out.println(ans);
    }

    // two functions of the same name can exist only if their parameter type or amount are different.
    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String str) {
        System.out.println("Second one");
        System.out.println(str);
    }
}
