package homeworks.homework_38_functionalInterface.task_2;

public class SumCalculatorDemo {

    public static void main(String[] args) {

        SumCalculator sum = (num1, num2) -> num1 + num2;

        int number1 = 10;
        int number2 = 20;

        int result = sum.calculate(number1, number2);

        System.out.println("Сумма: " + result);

    }
}
