package CollectionFramework.lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
   //    int MyArray [] = new int[2];
     //   MyArray[1] = "hello";
//        MyArray[0] = 7;
       // MyArray[2] = 8;
        //MyArray [3] = 9;
        //System.out.println(MyArray);





        ArrayList words = new ArrayList(); // Declaring a new array
        words.add("hello");
        words.add("There"); // auto matikisht ketu behet zero
        words.add("10");
       words.remove(0);

       words.add(9);
        words.add(12.00);
        words.add('H');

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        //int item1 = (int) words.get(2);
      // double  item2 = (double) words.get(3);

       // System.out.println(item2);
        //String item1 = (String) words.get(2);
        //System.out.println(item1);

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(6);
        numbers.add(45);
        numbers.add(67);
        numbers.add(89);
       // numbers.remove();


        for (int j = 0; j < numbers.size(); j++) {
            System.out.println(numbers.get(j));


        }
    }
}