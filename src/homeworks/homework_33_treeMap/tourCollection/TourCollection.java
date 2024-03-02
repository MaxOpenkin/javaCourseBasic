package homeworks.homework_33_treeMap.tourCollection;

import java.util.LinkedList;
import java.util.Queue;

public class TourCollection {

    private Queue<String> requests;
    private int maxSize;


    public TourCollection(int maxSize) {
        this.maxSize = maxSize;
        this.requests = new LinkedList<>(); // LinkedList подходит для реализации FIFO
    }


    public void addRequest(String request) {
        if (requests.size() < maxSize) {
            requests.offer(request); // Добавляем запрос в конец очереди
            System.out.println("Запрос добавлен: " + request);
        } else {
            System.out.println("Коллекция запросов полна. Невозможно добавить запрос: " + request);
        }
    }


    public void processRequest() {
        if (requests.isEmpty()) {
            System.out.println("Список запросов пуст.");
        } else {
            String processedRequest = requests.poll(); // Удаляем и возвращаем первый запрос из очереди
            System.out.println("Запрос обработан: " + processedRequest);
        }
    }


    public int getQueueSize() {
        return requests.size();
    }


    public int getMaxSize() {
        return maxSize;
    }

}
