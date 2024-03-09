package homeworks.homework_36.collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        ArrayDeque<String> myDeque = new ArrayDeque<>();

        myDeque.addFirst("Первый с начала");
        myDeque.addLast("Первый с конца");
        myDeque.addFirst("Второй с начала");
        myDeque.addLast("Второй с конца");

        System.out.println(myDeque);

        String removedElement = myDeque.removeFirst();
        System.out.println("Извлекаемый элемент с начала: " + removedElement);

        System.out.println("Очередь после одного извлеченного элемента с начала" + myDeque);

    }
}
