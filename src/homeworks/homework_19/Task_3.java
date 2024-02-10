package homeworks.homework_19;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {

    /*
    Создайте массив из 8 случайных целых чисел из отрезка [1;10].
    Отсортируйте массив по убыванию любым из алгоритмов.
     */

        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Массив: " + Arrays.toString(array));

        // Сначала сортируем массив стандартным методом, а затем через цикл сортируем в обратном порядке:

        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Отсортированный массив по убыванию: " + Arrays.toString(array));

    }
}
