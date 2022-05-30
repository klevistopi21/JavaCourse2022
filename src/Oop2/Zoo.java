package Oop2;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal(10, "Male", 24);
        animal1.eat();
        animal1.sleep();

        Bird bird1 = new Bird(2,"Female",1);
        //bird1.fly();

        //until now i wasnt able to call eat and sleep
        //after doing inheritance im able to invoke all the methods from Animal class
        bird1.eat();
        bird1.sleep();
        Chicken chick1 = new Chicken(1, "Male", 4);
       // chick1.fly();

    }

}
