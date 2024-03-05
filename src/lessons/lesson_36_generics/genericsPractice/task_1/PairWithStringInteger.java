package lessons.lesson_36_generics.genericsPractice.task_1;

import java.util.Arrays;

public class PairWithStringInteger {

    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>(Arrays.asList("Лось", "Олень", "Сайгак"), 123);

        System.out.println("Пара Стринг и Интеджер: " + pair1.getFirst() + ", " + pair1.getSecond());

    }
}
