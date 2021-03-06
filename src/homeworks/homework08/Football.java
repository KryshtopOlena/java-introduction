package homeworks.homework08;

import java.util.Arrays;

public class Football {

    public static void main(String[] args) {
        int size = 11;
        int min = 18;
        int max = 45;

        int[] allAge1 = fillArray(size, max, min);
        System.out.println(Arrays.toString(allAge1));

        int[] allAge2 = fillArray(size, max, min);
        System.out.println(Arrays.toString(allAge2));

        compareAverage(calculateAverage(allAge1), calculateAverage(allAge2));

    }

    public static void compareAverage(double average1, double average2) {
        if (average1 > average2) {
            System.out.println("Середній вік гравців першої команди вищий.");
        } else if (average1 < average2) {
            System.out.println("Середній вік гравців другої команди вищий.");
        } else {
            System.out.println("Середній вік обох команд рівний");
        }
    }

    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int[] fillArray(int size, int max, int min) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((max - min) + 1) + min);
        }
        return array;
    }
}
