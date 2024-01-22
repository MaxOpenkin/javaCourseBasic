package lessons.lesson_05.CalculatorWithReturnTest;

public class CalculatorWithReturnDemo {
    public static void main(String[] args) {

        CalculatorWithReturnTest calculatorWithReturnTest = new CalculatorWithReturnTest();

        int a = 30;
        int b = 10;

        int resultFromMethod = calculatorWithReturnTest.sub(a, b);

        System.out.println("Результат вычитания a и b: а = " + a + " - b = " + b + " будет равен: " + resultFromMethod);


        CalculatorWithReturnTest calculatorWithReturnTest1 = new CalculatorWithReturnTest();

        int c = 2;
        int d = 2;

        int resultFromMethod1 = calculatorWithReturnTest.multiplication(c, d);

        System.out.println("Результат умножения с и d: c = " + c + " * d = " + d + " будет равен: " + resultFromMethod1);


        CalculatorWithReturnTest calculatorWithReturnTest2 = new CalculatorWithReturnTest();

        int e = 7;
        int f = 2;

        double resultFromMethod2 = calculatorWithReturnTest.div(e, f);

        System.out.println("Результат деления e и f: e = " + e + " / f = " + f + " будет равен: " + resultFromMethod2);
    }
}
