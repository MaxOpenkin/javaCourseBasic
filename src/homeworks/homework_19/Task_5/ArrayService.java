package homeworks.homework_19.Task_5;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {

    /*
    Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
    Введенное пользователем число сохраняется в переменную n.
    Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
    Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
     */

    int[] array;

    public int[] generateRandomArray() {
        UserInput userInput = new UserInput();
        Random random = new Random();

        int n = userInput.inputInteger("Введите размер массива (больше 3): ");

        while (n <= 3) {
            n = userInput.inputInteger("Неподходящее число, повторите ввод: ");
        }

        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n + 1);
        }
        System.out.println("Сгенерированный массив: " + (Arrays.toString(array)));
        return array;
    }


    public int[] extractAndPrintEvenNumbers() {
        int evenCount = 0;

        // Сначала определяем количество четных элементов
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                evenCount++;
            }
        }

        // Создаем новый массив только с четными элементами
        int[] evenArray = new int[evenCount];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                evenArray[index] = array[i];
                index++;
            }
        }

        // Печатаем четные элементы
        if (evenCount > 0) {
            System.out.print("Массив из чётных элементов первого массива: ");
            for (int i = 0; i < evenCount; i++) {
                System.out.print(evenArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("В исходном массиве нет чётных элементов.");
        }

        return evenArray;
    }


}




