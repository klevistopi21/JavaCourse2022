package Start.Operators;

public class Main {
    public static void main(String[] args) {
        System.out.println("Post increment");
        int x = 3;
        int y = x++;
        System.out.println(y);
        System.out.println(x);

        System.out.println("Pre increment");
        int a = 3;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

        int z = 5;
        System.out.println(z--);
        System.out.println("second ----->  is = " + z);

    }
}
