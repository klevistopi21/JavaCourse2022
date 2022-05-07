package Day1.SwitchCase;

public class Day {
      /*
        switch(expression){
         case value1: some action; break;
         case value2 : some other action; break;
         ...
         case valuen : some other action; break;
         default: default action, always executed;

        }
        *
        **/

    public void findTheDay(int nr) {
        switch (nr) {
            case 1:
                System.out.println("E hene");
                break;
            case 2:
                System.out.println("E marte");

            case 3:
                System.out.println("E merkure");

            case 4:
                System.out.println("E enjte");
                break;
            case 5:
                System.out.println("E premte");

            case 6:
                System.out.println("E shtune");
                break;
            case 7:
                System.out.println("E diel");
                break;
            default:
                System.out.println("Vlere e gabuar");
        }
    }



}
