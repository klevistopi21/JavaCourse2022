package Start.Fundamentals;

public class Dog {
    //karakteristika/vecori => variabla (instance)
    //accessModifier, tipi, emri i variables, pikepresje
    //accessModifier => public, private, protected, default

   public String name; //by default = null
    public int age ;
    // by default = 0
    public String type;
    public String color;
    public char gender; // by default = 0
    public boolean isPet; //by default = false

    //sjelljet => metoda
    //access modifier, return type, emri i metodes, (parametra/ose jo), {}

//void dmth bosh. nuk kthen asgje
    public void bark() {
        System.out.println("hum hum");
    }

    public void play() {
        System.out.println("eshte koha per te luajtur");
    }

    public void eat() {
        System.out.println("Stop playing, time to eat");
    }

    public void sleep() {
        System.out.println("Finally time to sleep. Good night!");
    }

    public void printData() {
        System.out.println("Emri eshte: " + name);
        System.out.println("Mosha: " + age);
        System.out.println("Lloji: " + type);
        System.out.println("Ngjyra:" + color);
        System.out.println("Gender: " + gender);
        System.out.println("Eshte kafshe shtepiake?" + isPet);
    }

}
