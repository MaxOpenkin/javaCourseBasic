package lessons.lesson_05.CalculatorWithReturnTest;

public class CalculatorWithReturnTest {

    public int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    // Variant 2 method sub
    public int sub1(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    public double div(int a, int b) {
        double result = (double) a / b;
        return result;
    }
}
