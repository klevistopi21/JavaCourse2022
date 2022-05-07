package Day1.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // krijohet nje array qe mban 5 elemente, cdo element = 0 by default

        numbers[0] = 3;
        numbers[1] = 5;
        numbers[2] = 7;
        numbers[3] = 9;
        numbers[4] = 11;
        //numbers[5] = 13; => ArrayIndexOutOfBoundsException

        int numriNePozicioninO = numbers[0];
        int numriNePozicionin1 = numbers[1];
        System.out.println("Numri ne pozicionin 0: " + numriNePozicioninO);
        System.out.println("Numri ne pozicionin 3: " + numriNePozicionin1);

//        int numriNePozicionin5 = numbers[5]; => ArrayIndexOutOfBoundsException
//        System.out.println("Numri ne pozicionin 5: "+numriNePozicionin5);






        Scanner scanner = new Scanner(System.in);
        System.out.println("Sa numra kerkon te japesh?");
        int size = scanner.nextInt();
        int[] numbers2 = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Jep elementin: " + i);
            int numri = scanner.nextInt();
            numbers2[i] = numri;
        }

        System.out.println("*****Iteroj cdo element te array-t nepermjet ciklit for******");
        for (int i = 0; i < numbers2.length; i++) { //i = pozicioni, index
            System.out.println("Numri ne pozicionin " + i + " eshte : " + numbers2[i]);
        }
    }
}
