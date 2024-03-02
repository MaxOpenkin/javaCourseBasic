package homeworks.homework_33_treeMap.tourCollection;

public class TourAgentApp {

    public static void main(String[] args) {

        TourCollection tourCollection = new TourCollection(3); // Максимальный размер коллекции - 3

        tourCollection.addRequest("Запрос 1: Тур в Бибирево>");
        tourCollection.addRequest("Запрос 2: Тур на Лесозавод");
        tourCollection.addRequest("Запрос 3: Тур в Вавилон");


        // Превышение максимального размера коллекции
        tourCollection.addRequest("Запрос 4: Тур в Германию");


        // Обработка запросов
        tourCollection.processRequest();
        tourCollection.processRequest();


        // Вывод текущего размера очереди
        System.out.println("Текущий размер очереди запросов: " + tourCollection.getQueueSize());


        // Добавление нового запроса после обработки предыдущих
        tourCollection.addRequest("Запрос 5: Тур в Дребезги");
    }

}
