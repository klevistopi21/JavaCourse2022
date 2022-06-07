package Oop2;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, String gender, int weightInKg) {
        super(age, gender, weightInKg);
    }

    @Override
    public void fly() {
        System.out.println(" Harabeli fluturon");
    }

//    @Override
//    public void move() {


    }



    // We added the Flyable interface is because
    // there are birds like chickens who cannot fly
    // so we cannot use the fly method for all birds
    // inside the Bird class object, thats why we
    // define this fly() by defining its own class
    // called Flyable. A method with its own class is
    // call the Interface.
//}
