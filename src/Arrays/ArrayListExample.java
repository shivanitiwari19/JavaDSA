package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int initialCapacity;
        ArrayList<Integer> list = new ArrayList<>(10);

        for(int i = 0 ; i < 5 ; i++){
            list.add(in.nextInt());
        }

        for(int i = 0 ; i < 5 ; i++){
            System.out.println(list.get(i));
        }

//        list.add(67);
//        list.add(8);
//        list.add(45);
//        list.add(66);
//        list.add(32);
//        list.add(34);
//        list.add(56);
//        list.add(89);
//        list.add(77);
//        list.add(7);
        System.out.println(list);

        System.out.println(list.contains(77));

        list.set(0,99);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}
