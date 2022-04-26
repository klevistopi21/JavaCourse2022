package Day2.ArraysExercices;

public class ArrayHelper {

    private int[] numbers;

    public ArrayHelper(int[] numbers) {
        this.numbers = numbers;
    }

    public void displayElements() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numri ne pozicionin " + (i + 1) + " eshte " + numbers[i]);
        }

    }

    public int findSum() {
        int shuma = 0;
        for (int i = 0; i < numbers.length; i++) {
            shuma = shuma + numbers[i];
        }
        return shuma;
    }

    public double findAverage() {
        double sum = findSum();
        return sum / numbers.length;
    }

    public void displayOddElements() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.println(numbers[i]);
            }
        }
    }

    public int[] displayOddElements2() {
        int[] oddNumbers = new int[numbers.length];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                oddNumbers[j] = numbers[i];
                j++;
            }
        }
        return oddNumbers;
    }

    public int[] reverseElements() {
        int j = 0;
        int[] reverseNumbers = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverseNumbers[j] = numbers[i];
            j++;
        }
        numbers = reverseNumbers;
        reverseNumbers = null;
        return numbers;
    }

    public int[] reverseElements2() {
        int j = numbers.length - 1;
        int temp;
        for (int i = 0; i <= j; i++) {
            temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;
            j--;
        }
        return numbers;
    }

    public void countOddsAndEvenElements() {
        int oddsCount = 0;
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddsCount++;
            }
        }
        System.out.println("Sasia e numrave cift eshte: " + evenCount);
        System.out.println("Sasia e numrave tek eshte: " + oddsCount);
    }

    public void findDuplicates() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }
    }

    public int findSecondLargestElement() {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return numbers[1];
    }

    public int findMax() {
        int max = -999;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public void findAllPairsSumEqualsTo(int sum) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == sum) {
                    System.out.println("(" + numbers[i] + "," + numbers[j] + ")");
                    break;
                }
            }
        }
    }

}
