package homeworks.homework_36.collections.priorityTaskQueue;

import java.util.PriorityQueue;

public class TaskDemo {

    public static void main(String[] args) {

        PriorityQueue<Task> tasks = new PriorityQueue<>();

        tasks.add(new Task("Task 1", 5));
        tasks.add(new Task("Task 2", 1));
        tasks.add(new Task("Task 3", 3));
        tasks.add(new Task("Task 4", 4));
        tasks.add(new Task("Task 5", 2));

        System.out.println("Список задач:" + tasks);


        System.out.println("Задачи по приоритету:");
        while (!tasks.isEmpty()){
            System.out.println(tasks.poll());
        }
    }
}
