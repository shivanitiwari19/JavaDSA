package Strings;
import java.util.ArrayList;
public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');          // converts the characters into their ASCII values
        System.out.println("a" + "b");          // concatenates the string
        System.out.println('a' + 3);            // ASCII value + 3
        System.out.println((char)('a' + 3));    // converts the ASCII value into char
        System.out.println((char)(98));         // b

        System.out.println("a" + 3);
        // this is same as after a few steps: "a" + 1
        // Imteger will be converted to Integer that will call toString()

        System.out.println("Shivani" + new ArrayList<>());
        System.out.println("Shivani" + new Integer(56));

        System.out.println(new Integer(35) + " " + new ArrayList<>());

        System.out.println("a" + 'a');
    }
}
