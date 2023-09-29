package com.First;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num =  input.nextFloat();
        System.out.println(num);

        //Type-Casting = Converting a bigger number into a smaller type explicitly.

        int num1 = (int)(67.78);
        System.out.println(num1);

//        // automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a);     // 257 % 256 = 1
//        System.out.println(b);
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b / c;
//        // Java automatically promotes the byte into int.
//        System.out.println(d);

//        byte b = 50;
//        b = b*2;
        // This will give an error because we are trying to store an int value into a byte.

        int numb = 'A';
        System.out.println(numb);   //Prints the ascii value.

        System.out.println("こんにちは");
        // It can print any character in any other language as unicode.
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
        // float + int - double = double
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result);
    }
}
