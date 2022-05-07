package homework2solution.ushtrimi6;

public class Numrat {

    public int gjejShumenTek(int startNumber, int endNumber){
        int shuma = 0;
        if(startNumber<endNumber && startNumber>=0 && endNumber<= 10000){
            for (int i=startNumber; i<= endNumber; i++){
                if (i%2 == 1){
                    shuma += i; // shuma = shuma + i

                }
            }
        }
        return shuma;
    }
}
