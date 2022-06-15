package CollectionFramework.lesson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        LinkedHashSet<Animal> animals = new LinkedHashSet<Animal>();
        //  Animal animal1 = new Animal("Dog",12);
        Animal animal2 = new Animal("Cat",8);
        Animal animal3 = new Animal("Bird",3);
        Animal animal4 = new Animal("Dog",12);
        Animal animal5 = new Animal("Camel",30);
       // animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

//         System.out.println(animal1.equals(animal4));
//        System.out.println(animal1.hashCode());
//        System.out.println(animal4.hashCode());
//        boolean item1 = animal1.equals(animal4);
//        System.out.println(item1);



        HashSet<String> values = new HashSet<String>();
        values.add("Random");
        values.add("Animal");
        values.add("Zoo");
        values.add("People");
        values.add("Car");
        values.add("Car");
        values.add("People");

        for (String elements: values) {
            System.out.println(elements);
        }
//        for (Animal elements: animals) {
//            System.out.println(elements);
//        }
    }
}
