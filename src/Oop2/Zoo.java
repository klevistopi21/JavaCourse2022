package Oop2;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal(12,"Male",67);
        Animal animal2 = new Animal(7,"Male",67);
        animal1.sleep();
        animal2.eat();


        Bird bird1 = new Bird(12,"Femerore",2);

        Chicken chicken1 = new Chicken(11,"F",23);
        chicken1.fly();

        Animal fish1 = new Fish(3,"F",23);


        // Animal sparrow1 = new Sparrow(1,"F",7);
        //sparrow1.move();
        //Chicken chick2 = new Chicken(3,"F",23);

        //fish1.move();

//        moveAnimals(fish1);
//        moveAnimals(sparrow1);
//        moveAnimals(chick2);
    }

//    public static void moveAnimals(Animal animal){
//        animal.move();
//   Flyable flyingBird = new Sparrow(1,"f", 6);
//   flyingBird.fly();
//   //Flyable flyingBird2 = new Bird(2,"F",12);

    }

//}
