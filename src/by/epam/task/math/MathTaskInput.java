package by.epam.task.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathTaskInput {
    private final Scanner scanner = new Scanner(System.in);

    public double inputDoubleValue(String message) {
        System.out.println(message);
        double value;
        while (true) {
            try {
                value = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please try again!(use \",\" as delimiter )");
                // Отчистим буфер
                scanner.nextLine();
            }
        }
        return value;
    }

    public double[] inputDoubleArray(int sizeOfArray, String message) {
        double[] array = new double[sizeOfArray];
        System.out.println(message + sizeOfArray);
        for (int i = 0; i < sizeOfArray; i++) {
            while(true){
                try{
                    array[i]=scanner.nextDouble();
                    scanner.nextLine();
                    break;
                }catch(InputMismatchException e){
                    System.out.println("Please try again!(use \",\" as delimiter )");
                    // Отчистим буфер
                    scanner.nextLine();
                }
            }
        }
        return array;
    }


}

