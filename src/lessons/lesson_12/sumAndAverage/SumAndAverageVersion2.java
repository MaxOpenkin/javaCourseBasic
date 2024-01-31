package lessons.lesson_12.sumAndAverage;

import lessons.lesson_06.scanner.UserInput;

public class SumAndAverageVersion2 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        // Переменные для отслеживания и хранения веденных чисел:

        int sum = 0;
        int count = 0;

        System.out.println("Введите числа. Для завершения введите 0.");

        while (true) {
            int number = userInput.inputInteger("Введите число: ");

            sum += number;                                              // Введенное число прибавляется к текущей сумме.
            count++;                                                    // Увеличивается счетчик введенных чисел.

            if (number == 0) {                                          // Введенное число 0 - то выходим из цикла.
                break;
            }

        }
        if (count > 0) {                                                // Проверка на число
            double average = (double) sum / count;
            System.out.println("Сумма введенных чисел: " + sum);
            System.out.printf("Среднее арифметическое: %.2f\n", average);
        } else {
            System.out.println("Вы не ввели ни одного числа.");
        }
    }
}
