package homework2solution.ushtrimi7;

public class Numri {
    public void afishoNr(int nr) {
        if (nr != 0) {

            for (int i = nr; i >= 0; i--) {
                System.out.println(i);
            }
            for (int i = nr; i <= 0; i++) {
                System.out.println(i);
            }
        }else {
            System.out.println(nr);
        }
    }
}