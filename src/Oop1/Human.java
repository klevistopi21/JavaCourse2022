package Oop1;

public class Human {
    //declaring human attributes
    String name;
    int age;
    int heightInInches;
    String eyeColor;


    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    // Defining human behaviors
    public void  speak (){
        System.out.println("Hello! My name is " + name);
        System.out.println("I'm "+ heightInInches + " inches tall");
        System.out.println("My eye color is" + eyeColor);
    }
    public void eat () {
        System.out.println("eating");
    }
    public void walk () {
        System.out.println("walking");
    }

    public void work () {
        System.out.println("warking");
    }
}
