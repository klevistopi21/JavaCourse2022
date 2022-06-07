package CollectionFramework.lesson2;

import javax.security.auth.login.AccountExpiredException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<String>();
        animal.add("Lion");
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Bird");

//        for (int i = 0; i <animal.size(); i++){
//            System.out.println(animal.get(i));
//        }
//
//        for (String value : animal) {
//            System.out.println(value);
//        }
        LinkedList<Vehicle> vehicles = new LinkedList<>();
        Vehicle vehicle2 = new Vehicle("Toyota","Camery", 1300,false);
        vehicles.add(new Vehicle("Honda","accord",1200,false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep","Wrangler",2500,true));

        for (Vehicle car : vehicles)
        {
//            System. o ut.println(car.getMake());
//            System.out.println(car.getModel());
//            System.out.println(car.getPrice());
           // System.out.println(car);
        }
        printElements(vehicles);
        printElements(animal);

      }
    public  static void printElements (List somelist){
        for(int i = 0; i <somelist.size();i++){
            System.out.println(somelist.get(i));
        }

    }
}
