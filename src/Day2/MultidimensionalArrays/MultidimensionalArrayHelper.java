package Day2.MultidimensionalArrays;

public class MultidimensionalArrayHelper {
    private int[][] grades;
    private int rowsCount;
    private int colsCount;

    public MultidimensionalArrayHelper(int[][] grades, int rowsCount, int colsCount) {
        this.grades = grades;
        this.rowsCount = rowsCount;
        this.colsCount = colsCount;
    }

    public void displayGrades() {
        for (int i = 0; i < rowsCount; i++) {

            for (int j = 0; j < colsCount; j++) {
                System.out.println("Nota per studentin " + (i + 1) + " dhe lenden " + (j + 1) + " eshte " + grades[i][j]);
            }
        }
    }

    public void findAverageForEachStudent() {
        double sum = 0;
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < colsCount; j++) {
                sum = sum + grades[i][j];
            }
            System.out.println("Mesatarja e studentit " + (i + 1) + " eshte : " + sum / colsCount);
            sum = 0;
        }
    }
}
