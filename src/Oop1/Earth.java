package Oop1;

public class Earth {
    public static void main(String[] args) {
        Human Reshat;
        //declaring a new object
        Reshat = new Human("Reshat",21,81,"black");
        Human ReshatFriend = new Human("Arlind",22,81,"yellow");


        // Assigning attributes to the object
//        Reshat.age = 20;
//        Reshat.eyeColor = "yellow";
//        Reshat.heightInInches = 81;
//        Reshat.name = " Reshat Nela";
//
//        Human ReshatFriend = new Human();
//        ReshatFriend.age = 20;
//        ReshatFriend.eyeColor = "yellow";
//        ReshatFriend.heightInInches = 81;
//        ReshatFriend.name = " Reshat Nela";



        Reshat.speak();
        Reshat.eat();
        ReshatFriend.speak();
    }
}
