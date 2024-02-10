package homeworks.homework_19.Task_4;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        ArrayService service = new ArrayService();

        int[] array1 = service.generateRandomArray(5);
        int[] array2 = service.generateRandomArray(5);

        System.out.println("Массив 1: " + (Arrays.toString(array1)));
        System.out.println("Массив 2: " + (Arrays.toString(array2)));

        double average1 = service.calculateAverage(array1);
        double average2 = service.calculateAverage(array2);

        System.out.println("Среднее арифметическое массива 1: " + average1);
        System.out.println("Среднее арифметическое массива 2: " + average2);

        // Сравнение средних арифметических и вывод результата

        if (average1 > average2){
            System.out.println("Среднее арифметическое элементов массива 1 больше");
        } else if (average1 < average2){
            System.out.println("Среднее арифметическое элементов массива 2 больше");
        } else {
            System.out.println("Среднее арифметическое элементов массивов равны");
        }
    }
}
