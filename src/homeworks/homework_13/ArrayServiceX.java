package homeworks.homework_13;

import java.util.Arrays;

public class ArrayServiceX {

    public void replaceOddIndicesWithZero (int[] array) {
        for (int i = 1; i < array.length; i = i + 2) {
            array[i] = 0;
        }
        System.out.println("Массив после замены элементов с нечетным индексом на ноль: " + Arrays.toString(array));
    }

    public void checkStrictlyIncreasing (int[] array1){
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] <=  array1[i - 1]){
                System.out.println("Массив не является строго возрастающей последовательностью.");
                return;
            }
        }
        System.out.println("Массив является строго возрастающей последовательностью.");
    }

    public int[] createArrayTask1 () {
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) + 1;
        }
        System.out.println("Массив: " + Arrays.toString(array));
        return array;
    }

    public int[] createArrayTask2 () {
        int[] array1 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 99) + 10;
        }
        System.out.println("Массив: " + Arrays.toString(array1));;
        return array1;
    }

}
