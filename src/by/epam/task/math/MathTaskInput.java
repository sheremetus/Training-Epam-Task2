package by.epam.task.math;

import java.util.Scanner;

public class MathTaskInput {

    public double inputDoubleValue(String message) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        double value;
        while (!scanner.hasNextDouble()) {
            System.out.println(message);
            scanner.next();
        }
        value = scanner.nextDouble();

        return value;
    }

    public double[] inputDoubleArray(int sizeOfArray, String message1, String message2) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        double[] array = new double[sizeOfArray];
        System.out.println(message1 + sizeOfArray);
        for (int i = 0; i < sizeOfArray; i++) {

            while (!scanner.hasNextDouble()) {
                System.out.println(message2);
                scanner.next();
            }
            array[i] = scanner.nextDouble();

        }
        return array;
    }


}

