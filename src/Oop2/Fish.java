package Oop2;

public class Fish extends Animal {
    public Fish(int age, String gender, int weightInKg) {
        super(age, gender, weightInKg);
    }

    @Override
    public void move() {
        System.out.println("fish swimming...");
    }


    public void swim () {
        System.out.println( " fish is swiming......");
    }

}
