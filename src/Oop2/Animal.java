package Oop2;

public abstract class  Animal {
    int age;
    String gender;
    int weightInKg;

    // Here we are gone def. the constructor....ok?
    public Animal(int age, String gender, int weightInKg) {
        this.age = age;
        this.gender = gender;
        this.weightInKg = weightInKg;
    }

    public Animal() {
    }

    public void eat(){
        System.out.println("Eating....");
    }
    public void sleep() {
        System.out.println("Sleeping");
    }

public abstract void move();
}
