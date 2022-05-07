package homework2solution.ushtrimi3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        VitiBrisht vitiBrisht = new VitiBrisht();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nr : ");
        int nr = scanner.nextInt();
        boolean eshteVitiiBrisht = vitiBrisht.eshteVitiBrisht(nr);
        System.out.println("Viti eshte i brisht: " + eshteVitiiBrisht);
    }
}
