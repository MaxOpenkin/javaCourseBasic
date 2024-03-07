package homeworks.homework_36.collections;

import java.util.PriorityQueue;

public class PriorityQueueInt {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue();

        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(40);
        priorityQueue.add(50);

        System.out.println(priorityQueue);

        Integer minElement = priorityQueue.poll(); // Извлекает и удаляет минимальный элемент
        System.out.println("Минимальный элемент в PriorityQueue: " + minElement);

        System.out.println("Оставшиеся элементы в PriorityQueue: " + priorityQueue);

    }
}
