package Start.Fundamentals;

public class Main {
    public static void main(String[] args) {
        //Emri i klases, emri i objektit, =, new, Emri i klases, (parametra/ose jo)

        Dog dog1 = new Dog();
        dog1.name = "Bubi";
        dog1.age = 3;
        dog1.type = "X";
        dog1.color = "white";
        dog1.gender = 'F';
        dog1.isPet = false;
        dog1.printData();
        dog1.bark();
        dog1.play();
        dog1.eat();
        dog1.sleep();

        Dog dog2 = new Dog();
        dog2.name = "Tobi";
        dog2.age = 1;
        dog2.type = "Y";
        dog2.color = "black";
        dog2.gender = 'M';
        dog2.isPet = true;
        dog2.printData();
        dog2.sleep();

    }

}
