package by.epam.task.math;

import java.util.Scanner;

public class MathTaskInput {
    private final Scanner scanner = new Scanner(System.in);

    public double inputDoubleValue() {
        System.out.println("Input double value");
        return scanner.nextDouble();
    }

    public double[] inputDoubleArray(int sizeOfArray) {
        double[] array = new double[sizeOfArray];
       System.out.println("Input array with size: "+sizeOfArray);
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }


}
