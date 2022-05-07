package Start.Statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conditions conditions = new Conditions();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shkruaj vleren e temperatures se ujit");
        double temperature =scanner.nextDouble();
        conditions.checkWaterTemp(temperature);


        System.out.println("Jep numrin e pare");
        int nr1 = scanner.nextInt();
        System.out.println("Jep numrin e dyte");
        int nr2 = scanner.nextInt();
        System.out.println("Jep numrin e trete");
        int nr3 = scanner.nextInt();
        conditions.findMax(nr1, nr2, nr3);


        System.out.println("Shuma nga 1-100: " + conditions.findSum());

        System.out.println("Shuma e numrave 1-100 qe plotepjestohen me 5: "+conditions.gjejShumenENumraveQePerpjestohenMe5());

    }
}
