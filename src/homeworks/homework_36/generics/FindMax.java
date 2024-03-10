package homeworks.homework_36.generics;

public class FindMax {

    // Напишите метод findMax, который принимает массив объектов и возвращает
    // наибольший из них. Используйте Generics для обеспечения возможности
    // передачи массива объектов любого типа.


    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Max Integer: " + findMax(intArray));

        String[] stringArray = {"apple", "orange", "banana", "pear"};
        System.out.println("Max String: " + findMax(stringArray));


    }
}
