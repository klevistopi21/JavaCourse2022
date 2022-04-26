package Day2.MultidimensionalArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        int[][] grades = new int[3][4];
//        grades[0][0] = 10;
//        grades[0][1] = 9;
//        grades[0][2] = 9;
//        grades[1][0] = 8;
//
//        System.out.println(grades[2][2]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sa eshte numri i studenteve? ");
        int rowsNumber = scanner.nextInt();
        System.out.println("Sa eshte numri i lendeve? ");
        int colsNumber = scanner.nextInt();
        int[][] grades = new int[rowsNumber][colsNumber];

        for (int i = 0; i < rowsNumber; i++) {
            for (int j = 0; j < colsNumber; j++) {
                System.out.println("Jep noten per studentin " + (i + 1) + " dhe lenden " + (j + 1));
                int grade = scanner.nextInt();
                grades[i][j] = grade;
            }
        }

        MultidimensionalArrayHelper multidimensionalArrayHelper = new MultidimensionalArrayHelper(grades,rowsNumber,colsNumber);
        multidimensionalArrayHelper.displayGrades();
        multidimensionalArrayHelper.findAverageForEachStudent();
    }
}
