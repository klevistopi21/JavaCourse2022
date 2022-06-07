package Oop1;

public class Earth {
    //Reshat.speak();
    //Human human1 = new Human("Bali",22,34,"yellow");
    public static void main(String[] args) {

       Human Klajdi;
        //declaring a new object
        Klajdi = new Human("Klajdi",21,81,"black");
        Human ReshatFriend = new Human("Klajdi",21,81,"black");


        // Assigning attributes to the object
//       Klajdi.age = 20;
//        Klajdi.eyeColor = "yellow";
//        Klajdi.heightInInches = 81;
//        Klajdi.name = " Klajdi 007";

    //    Human ReshatFriend = new Human();
        ReshatFriend.age = 20;
        ReshatFriend.eyeColor = "yellow";
        ReshatFriend.heightInInches = 81;
        ReshatFriend.name = " Reshat Nela";


        System.out.println(Klajdi.age);
        System.out.println("lart eshte vlera e age jo e klajdit" );
        System.out.println();

        Klajdi.speak();
        Klajdi.walk();
        ReshatFriend.eat();

    }
}
