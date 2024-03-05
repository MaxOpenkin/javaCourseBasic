package lessons.lesson_36_generics.genericsPractice.task_1;

import java.util.Arrays;

public class PairWithIntegerString {
    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>(Arrays.asList(1, 2, 3), "Числа");

        System.out.println("Пара Интеджер и Стринг: " + pair1.getFirst() + ", " + pair1.getSecond());

    }
}
