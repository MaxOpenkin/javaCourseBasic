package homeworks.homework_36.collections.linkedHashMapTime;

import java.util.*;

public class TimeDemo {

    public static void main(String[] args) {

        Map<Time, List<String>> timeMap = new LinkedHashMap<>();

        // Добавление строк в список для каждого времени
        timeMap.put(new Time(10, 30), Arrays.asList("Событие 1", "Событие 2"));
        timeMap.put(new Time(9, 15), Arrays.asList("Событие 3"));
        timeMap.put(new Time(15, 45), Arrays.asList("Событие 4", "Событие 5", "Событие 6"));


        // Сортировка ключей (времени) перед добавлением в LinkedHashMap для сохранения порядка
        List<Time> sortedTimes = new ArrayList<>(timeMap.keySet());
        Collections.sort(sortedTimes);


        // Создание нового LinkedHashMap для сохранения отсортированного порядка
        Map<Time, List<String>> sortedTimeMap = new LinkedHashMap<>();
        for (Time time : sortedTimes) {
            sortedTimeMap.put(time, timeMap.get(time));
        }


        // Вывод всех элементов отображения на консоль
        for (Map.Entry<Time, List<String>> entry : sortedTimeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}
