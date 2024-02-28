package homeworks.homework_29_list_map_set.linkedList_numberOperations;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class minMaxNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100) +1);
        }

        System.out.println("Наш список чисел: " + numbers);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

        Collections.sort(numbers);
        System.out.println("Отсортированный список: " + numbers);

    }
}
