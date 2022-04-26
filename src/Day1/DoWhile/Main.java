package Day1.DoWhile;

public class Main {
     /*
    do-while:

       do{
         code;
       }while(condition);
    *

    while:

    while(condition){
      code;
    }

    **/

    public static void main(String[] args) {

        int x = 10;

        while (x > 10) {
            System.out.println(x);
        }

        do {
            System.out.println(x);
        } while (x > 10);

    }
}
