package Functions;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Shivani";
        greet(name);
    }
    static void greet(String naam){        // here, a copy of name is being created.
        System.out.println(naam);          // the original object is not getting changed, a new object is created.
    }
}
