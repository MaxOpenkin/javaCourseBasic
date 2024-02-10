package homeworks.homework_19;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class Task_2 {

    public static void main(String[] args) {

        /*
        Напишите программу, которая определит, сколько слов Вы ввели с консоли.
         */

        UserInput userInput = new UserInput();

        String myString = userInput.inputText("Введите строку: ");

        String[] words = myString.split("\\s+");        // Разделяем строку на слова по пробелам (или другим пробельным символам)
        int wordCount = words.length;                         // Получаем количество слов в строке

        System.out.println("Количество слов в строке: " + wordCount);
    }
}
