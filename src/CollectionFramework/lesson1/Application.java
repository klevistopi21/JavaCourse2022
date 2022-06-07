package CollectionFramework.lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        //int MyArray [] = new int[];
        ArrayList<String> words = new ArrayList<String>(); // Declaring a new array
        words.add("hello");
        words.add("There");
        words.add("10");
        words.remove(0);
//        words.add(9);
//        words.add(12.00);
//        words.add('H');

//        int item1 = (int)words.get(2);
//       int  item2 = (int)words.get(3);
        //System.out.println(item1);
        //System.out.println(item2);
        //String item1 = words.get(2);
        //System.out.println(item1);

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(6);
        numbers.add(45);
        numbers.add(67);
        numbers.add(89);
        numbers.remove();


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
    }
}