package CollectionFrameworks;

import java.util.ArrayList;
import java.util.List;
public class Initialisation {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> vegetables = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapes");

        vegetables.add("Potato");
        vegetables.add("Carrot");

        fruits.set(1, "Banana");
        fruits.addAll(vegetables);
        fruits.remove(1);
        System.out.println(fruits.get(0));
        System.out.println(fruits);


        List <String> toRemove = new ArrayList<>();
        toRemove.add("Apple");
        toRemove.add("Potato");

        fruits.removeAll(toRemove);
        System.out.println(fruits);

        System.out.println(fruits.size());     // returns size of the list as int value

        System.out.println(fruits.contains("Guava"));   // returns boolean

        String[] temp = new String[fruits.size()];
        fruits.toArray(temp);
        for(String e: temp){
            System.out.print(e + " ");
        }
    }
}
