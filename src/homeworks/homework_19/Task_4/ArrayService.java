package homeworks.homework_19.Task_4;

import java.util.Random;

public class ArrayService {

        /*
        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
        Выведите массивы на экран в двух отдельных строках
        Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
         */

    public int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(6);
        }
        return array;
    }


    public double calculateAverage (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

}
