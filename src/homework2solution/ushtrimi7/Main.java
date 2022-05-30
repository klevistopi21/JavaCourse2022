package homework2solution.ushtrimi7;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //numri is an instance of thr Numri class
        Numri numri = new Numri();

        Scanner scanner = new Scanner(System.in);
        System.out.println("vendos nr");
        int nr = scanner.nextInt();

        numri.afishoNr(nr);

    }
}
