package homeworks.homework05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandLuggage {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть дані розміру багажу в сантиметрах:");
        System.out.print("Висота багажу - ");
        double height = Double.parseDouble(reader.readLine());
        System.out.print("Довжина багажу - ");
        double length = Double.parseDouble(reader.readLine());
        System.out.print("Ширина багажу - ");
        double width = Double.parseDouble(reader.readLine());
        boolean flag = isHandSuitcase(height, length, width);
        String message = flag ? "Ви можете взяти багаж у салон" : "Ви не можете взяти багаж у салон";
        System.out.println(message);
    }

    public static boolean isHandSuitcase(double height, double length, double width) {
        double maxHeight = 53;
        double maxLength = 40;
        double maxWidth = 22;
        double maxHeightBag = 40;
        double maxLengthBag = 55;
        double maxWidthBag = 20;

        return height <= maxHeight && length <= maxLength && width <= maxWidth || height <= maxHeightBag &&
                length <= maxLengthBag && width <= maxWidthBag;
    }
}


