package homeworks.homework_19.Task_5;


import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        ArrayService service = new ArrayService();

        service.generateRandomArray();

        //service.extractAndPrintEvenNumbers();

        int [] evenArray = service.extractAndPrintEvenNumbers();
        System.out.println("Массив из четных элементов первого массива: " + Arrays.toString(evenArray));

    }
}
