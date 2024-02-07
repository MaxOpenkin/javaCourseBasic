package lessons.lesson_12_removeSymbols.sumAndAverage;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class SumAndAverageDemo {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        SumAndAverage sumAndAverage = new SumAndAverage();

        System.out.println("Введите числа. Для завершения введите 0.");

        while (true) {
            int number = userInput.inputInteger("Введите число: ");

            if (number == 0) {
                break;
            }

            sumAndAverage.processNumber(number);
        }

        // Вывод результатов
        System.out.println("Сумма введенных чисел: " + sumAndAverage.getSum());
        System.out.printf("Среднее арифметическое: %.2f\n", sumAndAverage.getAverage());
    }
}
