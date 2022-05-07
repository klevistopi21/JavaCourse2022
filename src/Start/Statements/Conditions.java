package Start.Statements;

public class Conditions {

    /*

    if(kushti_1){

    trupi_1; => egzekutohet ne rastin kur kusht_1 eshte i vertete/plotesohet

    }
    else if(kusht_2){

    trupi_2; =>egzekutohet ne rastin kur kusht_2 eshte i vertete/plotesohet

    }
    else{
    trupi_3; => egzekutohet ne rastin kur asnje nga kushtet me siper nuk rezulton i vertete
    }

    **/

    public void checkWaterTemp(double temp) {

        if (temp >= 100) {
            System.out.println("Water is boiling");
        } else if (temp <= 0) {
            System.out.println("Water is freezing");
        } else {
            System.out.println("Water is in normal conditions");
        }
    }
//gjej me te madhin nga 3 numrat
    public void findMax(int a, int b, int c) {
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Numri me i madh eshte: " + max);
    }

    public boolean findIfEven(int nr) {
        if (nr % 2 == 0) {
            return true;
        }
        return false;

    }

    /*
    inicializimi fillestar;
    while(kushti i ndalimit){
    trupi;
    increment/decrement i inicializimit fillestar
    }


    *
    **/

    public int findSum() {
        int i = 1;
        int shuma = 0;
        while (i <= 100) {
            shuma = shuma + i;
            i++;
        }
        return shuma;

    }

    /*
    for(inicializimi fillestar; kushti ; increment/decrement)
    *
    **/

    public int gjejShumenENumraveQePerpjestohenMe5() {
        int shuma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                shuma = shuma + i;
            }
        }
        return shuma;
    }

}
