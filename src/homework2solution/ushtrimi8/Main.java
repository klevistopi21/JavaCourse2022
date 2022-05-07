package homework2solution.ushtrimi8;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Vendos nr ");
        int nr=scanner.nextInt();
        Math math=new Math();
        math.gjejPerpjestuesitE10PoshtNr(nr);
    }
}
