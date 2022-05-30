package Oop2;

public class Bird extends Animal{
    public Bird(int age, String gender, int weightInKg) {
        super(age, gender, weightInKg);
    }

//    public void fly() {
//        System.out.println("Flying....");
//    }

    // This method specifically belongs to the
    // Bird object, its it developed itself and
    // did not inherit from its parent class (Animal class).
    // Only Objects children to "Bird" class that extends to
    // the "Bird" class can inherit this method.
}
