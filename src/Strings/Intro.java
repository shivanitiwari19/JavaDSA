package Strings;

public class Intro {
    public static void main(String[] args) {
        String name = "Shivani Tiwari";
        String a = "Shivani";
        System.out.println(a);
        a = "Tiwari";              // a new object was created rather than modifying the older one.
        System.out.println(a);     // the older object goes into garbage collection.
    }
}
