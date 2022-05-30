package homework2solution.ushtrimi3;

public class VitiBrisht {
    public boolean eshteVitiBrisht(int viti) {

        if (viti % 4 == 0) {
            if (viti % 100 == 0) {
                if (viti % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }

    }
}
