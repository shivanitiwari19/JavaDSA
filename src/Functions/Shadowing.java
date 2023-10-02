package Functions;
// Shadowing does not work for methods

public class Shadowing {
    static int x = 90;        // this will be shadowed
    //anything you are going to use inside main needs to be static.
    public static void main(String[] args) {
        System.out.println(x);       // 90
        int x =40;                   // the class variable at line 4 is shadowed by this line.
        System.out.println(x);       // 40
        fun();                       // 90

        // Scope of a variable begins only when it is initialised. Just declaration does not work.
    }

    static void fun(){
        System.out.println(x);      // iske liye line 4 wala x valid hoga kyunki line 8 wala x iske scope se bahar hai
    }
}
