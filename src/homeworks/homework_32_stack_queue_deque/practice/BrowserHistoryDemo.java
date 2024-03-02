package homeworks.homework_32_stack_queue_deque.practice;

public class BrowserHistoryDemo {

    public static void main(String[] args) {

        QueueBrowserHistory queueBrowserHistory = new QueueBrowserHistory();

        queueBrowserHistory.visit("https://ait-tr.de");
        queueBrowserHistory.visit("https://google.com");
        queueBrowserHistory.visit("https://yandex.ru");
        queueBrowserHistory.visit("https://java.com");
        queueBrowserHistory.visit("https://github.com");
        queueBrowserHistory.visit("https://oracle.com");

        queueBrowserHistory.showHistory();

    }
}
