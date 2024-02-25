package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Shivani";
        String b = "Shivani";
        String c = a;
        // ==
        System.out.println(a == b);   // gives true because both the ref vars are pointing to the same object because
                                           // duplicate values are not allowed in the string pool.
        System.out.println(c == a);
        // returns true

        String name1 = new String("Shivani");
        String name2 = new String("Shivani");

        System.out.println(name1 == name2);   // this will give false because the objects are created outside the string pool
                                              // and the ref vars are pointing to two different objects with the same value
        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));  //method to access index values of a string.
    }
}
