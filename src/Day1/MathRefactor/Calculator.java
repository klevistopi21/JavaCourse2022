package Day1.MathRefactor;

public class Calculator {
    private double nr1;
    private double nr2;

    public Calculator(double nr1, double nr2) { // konstruktori
        if (nr2 == 0) {
            nr2 = 1;
        }
        this.nr1 = nr1;
        this.nr2 = nr2;
    }


    public double gjejHeresin() {
        return nr1 / nr2;
    }



}
