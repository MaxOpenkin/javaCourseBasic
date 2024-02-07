package homeworks.homework_11;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class SumUntilNegative {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        int sum = 0;

        while (true) {
            int userNumber = userInput.inputInteger("Введите число (для завершения введите отрицательное число): ");

            if (userNumber < 0) {           // Проверяем условие завершения цикла
                break;                      // Если введено отрицательное число, завершаем цикл
            }
            sum += userNumber;              // Если введенное число положительное, добавляем его к сумме
        }
        System.out.println("Сумма введенных чисел до первого отрицательного: " + sum);
    }
}

/*
В этом коде цикл while выполняется до тех пор, пока пользователь вводит положительные числа.
Как только введено отрицательное число, цикл завершается,
и программа выводит сумму введенных чисел до первого отрицательного.
 */
