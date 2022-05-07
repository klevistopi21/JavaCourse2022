package homework2solution.ushtrimi4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos piket:");
        int piket=scanner.nextInt();
        while (piket<40 || piket >100){
            System.out.println("Vendos piket 40-100.");
            piket=scanner.nextInt();
        }
        student.shfaqNoten(piket);
    }
}
