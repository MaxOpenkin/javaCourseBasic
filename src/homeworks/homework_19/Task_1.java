package homeworks.homework_19;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {

        /*
        Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
        Не используйте дополнительный массив для хранения результатов.
         */

        String[] array = {"Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday"};

        System.out.println("Исходный массив: " + (Arrays.toString(array)));

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        /*
        Цикл переставляет элементы массива в обратном порядке,
        проходя только до середины массива и меняя местами элементы симметрично относительно середины.
         */

        System.out.println("Массив после обращения: " + (Arrays.toString(array)));
    }
}
