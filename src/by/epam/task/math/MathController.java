package by.epam.task.math;

public class MathController {

    public static void main(String[] args) {
        MathTaskInput input = new MathTaskInput();
        MathTaskLogic calc = new MathTaskLogic();
        MathTaskView view = new MathTaskView();

        String message1 = "Input double value";
        String message2 = "Input double array with size: ";

        // Task 4
        double x = input.inputDoubleValue(message1);
        double y = input.inputDoubleValue(message1);
        boolean result4 = calc.isDotInShadedArea(x, y);
        view.showBooleanResult(result4);

        // Task 5
        double[] array5 = input.inputDoubleArray(3, message2, message1);
        double[] result5 = calc.negativeToFourthPositiveToSecond(array5);
        view.showArray(result5);

        // Task 6
        double[] array6 = input.inputDoubleArray(3, message2, message1);
        double result6 = calc.sumMinAndMax(array6);
        view.showDouble(result6);

    }

}
