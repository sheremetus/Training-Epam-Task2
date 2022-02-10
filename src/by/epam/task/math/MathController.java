package by.epam.task.math;

public class MathController {

    public static void main(String[] args) {
        MathTaskInput input = new MathTaskInput();
        MathTaskLogic calc = new MathTaskLogic();
        MathTaskView view = new MathTaskView();

       // Task 4
        double x = input.inputDoubleValue();
        double y = input.inputDoubleValue();
        boolean result4 = calc.mathTask4(x, y);
        view.showBooleanResult(result4);

        // Task 5
        double[] array5 = input.inputDoubleArray(3);
        double[] result5 = calc.mathTask5(array5);
        view.showArray(result5);

        // Task 6
        double[] array6 = input.inputDoubleArray(3);
        double result6 = calc.mathTask6(array6);
        view.showDouble(result6);

    }

}
