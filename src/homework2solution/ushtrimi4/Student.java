package homework2solution.ushtrimi4;


public class Student {
    public void shfaqNoten(int piket){
        char nota;
        if(piket >=90 && piket<=100){
            nota='A';
        }
        else if(piket>=80 && piket<=89){
            nota='B';
        }
        else if (piket >=70 && piket<=79){
            nota='C';
        }
        else if(piket>=60 && piket <=69){
            nota='D';
        }
        else {
            nota='F';
        }
        System.out.println("nota eshte:"+nota);
    }
}
