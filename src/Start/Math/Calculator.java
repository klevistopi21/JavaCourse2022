package Start.Math;

public class Calculator {
    private double nr1;
    private double nr2;
    //private  double nr3;


    //constuctor
    //access modifier, emri i klases, (variablat e instances qe duam t'u japim vleredhenie),{trupi i konstruktorit}
    public Calculator(double nr1,double nr2){
        this.nr1 = nr1;
        this.nr2 = nr2;
    }
//    public Calculator() {
//    }

    public void gjejShumen() {
//        double shuma = 0.0;
//        shuma = nr1+nr2;
        double shuma = nr1 + nr2;
        System.out.println(shuma);
    }

    public void gjejNdryshesen() {
//        double diferenca = 0.0;
//        diferenca = nr1-nr2;
        double diferenca = nr1 - nr2;
        System.out.println(diferenca);
    }

    public void gjejHeresin() {
//        double heresi = 0.0;
//        heresi = nr1/nr2;
        double heresi = nr1 / nr2;
        System.out.println(heresi);
    }

    public void gjejProdhimin() {
//        double prodhimi = 0.0;
//        prodhimi = nr1*nr2;
//
        double prodhimi = nr1 * nr2;
        System.out.println(prodhimi);
    }

}
