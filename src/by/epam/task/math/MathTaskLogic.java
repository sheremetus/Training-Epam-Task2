package by.epam.task.math;

import static java.lang.Math.pow;

public class MathTaskLogic {

    public boolean mathTask4(double x, double y) {

        return ((y > 0 && y <= 4 && x <= 2 && x >= -2) || (y <= 0 && y >= -3 && x <= 4 && x >= -4));
    }

    public double[] mathTask5(double[] array) {

        for (int i = 0; i < 3; i++) {
            if (array[i] >= 0) {
                array[i] = pow(array[i], 2);
            } else {
                array[i] = pow(array[i], 4);
            }
        }
        return array;
    }

    public double mathTask6(double[] array){
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }

        }
        return (max+min);
    }


}