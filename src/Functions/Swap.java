package Functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        //swap two numbers
//        int temp=a;
//        a=b;
//        b=temp;

        swap(a, b);
        System.out.println(a + " " + b);
    }

    static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        /* the values are not going to be swapped. */
        /* see the file PassingExample for better understanding. */
    }
}
