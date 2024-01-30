package homeworks.homework_11;

import lessons.lesson_06.scanner.UserInput;

public class CountEvenOddNumbers {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        int numberOfIterations = userInput.inputInteger("Введите число для проверки: ");

        // Инициализируем переменные для подсчета четных и нечетных чисел:
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numberOfIterations; i++) {
            if (i % 2 == 0) {                               // Проверяем, является ли текущее число четным или нечетным
                evenCount++;                                // Если четное, увеличиваем счетчик четных чисел
            } else {
                oddCount++;                                 // Если нечетное, увеличиваем счетчик нечетных чисел
            }
        }
        System.out.println("Количество четных чисел от 0 до " + numberOfIterations + ": " + evenCount);
        System.out.println("Количество нечетных чисел от 0 до " + numberOfIterations + ": " + oddCount);
    }
}

/*
В этом коде мы используем цикл for для перебора чисел от 0 до numberOfIterations и проверяем,
является ли каждое число четным или нечетным.
Счетчики evenCount и oddCount увеличиваются в зависимости от результата проверки.
По завершении цикла выводим количество четных и нечетных чисел.
 */