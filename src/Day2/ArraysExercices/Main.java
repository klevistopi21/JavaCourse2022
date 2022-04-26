package Day2.ArraysExercices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep sasine e elementeve qe kerkon te japesh");
        int size = scanner.nextInt();
        int[] userNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Jep elementin " + (i + 1));
            int nr = scanner.nextInt();
            userNumbers[i] = nr;
        }
        ArrayHelper arrayHelper = new ArrayHelper(userNumbers);
        arrayHelper.displayElements();

        int sum = arrayHelper.findSum();
        System.out.println("Shuma e elementeve te ruajtura ne array eshte: " + sum);

        double average = arrayHelper.findAverage();
        System.out.println("Mesatarja e elementeve te ruajtuara ne array eshte: " + average);

        System.out.println("Elementet tek te ruajtur ne array jane: ");
        arrayHelper.displayOddElements();

        System.out.println("Elementet tek te ruajtur ne array sipas menyres 2 jane: ");
        int[] oddNumbers = arrayHelper.displayOddElements2();
        ArrayHelper arrayHelperForOddNumber = new ArrayHelper(oddNumbers);
        arrayHelperForOddNumber.displayElements();

//        System.out.println("Reverse elements: ");
//        int[] reverseElements = arrayHelper.reverseElements();
//        ArrayHelper arrayHelperForReverseElements = new ArrayHelper(reverseElements);
//        arrayHelperForReverseElements.displayElements();

        System.out.println("Reverse elements sipas menyres 2: ");
        int[] reverseElements2 = arrayHelper.reverseElements2();
        ArrayHelper arrayHelperForReverseElements2 = new ArrayHelper(reverseElements2);
        arrayHelperForReverseElements2.displayElements();

        arrayHelper.countOddsAndEvenElements();

        System.out.println("Duplikime te elementeve: ");
        arrayHelper.findDuplicates();

        int secondLargestElement = arrayHelper.findSecondLargestElement();
        System.out.println("Elementi i dyte me i madh eshte: " + secondLargestElement);

        int max = arrayHelper.findMax();
        System.out.println("Elementi me i madh ne array eshte: " + max);

        System.out.println("Jep shumen: ");
        int sumValue = scanner.nextInt();
        arrayHelper.findAllPairsSumEqualsTo(sumValue);
    }
}
