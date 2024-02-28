package lessons.lesson_32_stack_queue_deque.practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBrowserHistory {

    private Queue<String> history;


    public QueueBrowserHistory() {
        this.history = new LinkedList<>();
    }


    // Метод для добавления страницы в историю
    public void visit(String url) {
        history.offer(url);
    }


    // Метод для просмотра всей истории
    public void showHistory() {
        System.out.println("Browser History:");
        for (String url : history) {
            System.out.println(url);
        }
    }


}
