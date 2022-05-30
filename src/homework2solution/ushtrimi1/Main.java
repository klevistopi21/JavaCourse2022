package homework2solution.ushtrimi1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Proportion theInstanceOfProportionClass = new Proportion();
        Scanner scannerInstanceOfTheScannerObject = new Scanner(System.in);

        System.out.println("Vendos numrin :" );
        int nr = scannerInstanceOfTheScannerObject.nextInt();

        boolean isPro=  theInstanceOfProportionClass.finPro(nr);
        if (isPro){
            System.out.println("Numri eshte perpjestues me 5");
        }else {
            System.out.println("Numri nuk eshte perpjestues me 5");
        }

    }
}
