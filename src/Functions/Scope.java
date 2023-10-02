package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String str = "Shivani";
        //        System.out.println(num);      // cannot access num in this block

        {
//            int a = 99;
            // already initialised outside the block in the same method, hence you cannot reinitialise it.

            a = 70;
            System.out.println(a);
            // but you can change the value, here a becomes 70. Original value is being updated here.

            int c = 99;
            // values initialised inside this block will remain in the block

            str = "Saakshi";
            System.out.println(str);
            // the variable str is updated.
        }
        System.out.println(str);

        int c = 900;
        // c can be initialised again outside the block because it is not known outside the block.
    }



     static void random(int marks) {     // arguments of a function can only be accessed inside the function
        int num = 67;
//        System.out.println(a);        // cannot access a in this block
    }
}
