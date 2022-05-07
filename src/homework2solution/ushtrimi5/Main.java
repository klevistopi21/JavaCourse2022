package homework2solution.ushtrimi5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("vendos sasine e numrave");
        int size= scanner.nextInt();
        double shuma=0;
        for(int i=0; i<size; i++){
            System.out.println("Vendos numrin ");
            int nr= scanner.nextInt();
            shuma=shuma+nr;
        }
        double mesatarja= shuma/size;
        System.out.println("Measatarja eshte"+mesatarja);


    }

}
