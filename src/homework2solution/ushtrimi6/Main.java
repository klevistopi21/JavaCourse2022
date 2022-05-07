package homework2solution.ushtrimi6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jepni numrin e pare:");
        int numri1 = scanner.nextInt();
        System.out.println("Jepni numrin e dyte:");
        int numri2 = scanner.nextInt();

        Numrat numrat = new Numrat();
        int shuma = numrat.gjejShumenTek(numri1, numri2);
        System.out.println("Shuma eshte:" + shuma);
    }
}
