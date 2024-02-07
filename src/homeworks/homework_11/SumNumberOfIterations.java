package homeworks.homework_11;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class SumNumberOfIterations {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        // Инициализируем переменную для хранения суммы четных чисел:

        int sum = 0;

        int i = 0;

        // Запрашиваем у пользователя ввести значение numberOfIterations:

        int numberOfIterations = userInput.inputInteger("Введите число для проверки: ");

        // Используем цикл while для подсчета суммы четных чисел от 0 до numberOfIterations

        while (i <= numberOfIterations){
            if (i % 2 == 0) {           // Перебираем все числа от 0 до numberOfIterations и проверяем, является ли каждое число четным
                sum += i;               // Если число четное, добавляем его к сумме
                System.out.println(sum);
            }
            i++;
        }
        System.out.println("Сумма четных чисел от 0 до " + numberOfIterations + " равна: " + sum);
    }
}
