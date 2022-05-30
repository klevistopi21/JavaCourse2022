package homework2solution.ushtrimi2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fut numrin: ");
        int numer = scanner.nextInt();

        Numri numri1 = new Numri();
        boolean eshteAferNumrit100 = numri1.isCloseTo(numer);
        System.out.println("Eshte afer numer 100: " + eshteAferNumrit100);


    }
}


