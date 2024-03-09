package homeworks.homework_36.collections.treeMapDate;

import java.time.LocalDate;
import java.util.*;

public class TreeMapWithDate {

    public static void main(String[] args) {

        TreeMap<LocalDate, List<String>> dateEvents = new TreeMap<>();

        addEvent(dateEvents, LocalDate.of(2024, 1, 1), "Новый Год");
        addEvent(dateEvents, LocalDate.of(2024, 2, 23), "День защитника Отечества");
        addEvent(dateEvents, LocalDate.of(2024, 3, 8), "Международный женский день");
        addEvent(dateEvents, LocalDate.of(2024, 1, 1), "Праздник каждого года");
        addEvent(dateEvents, LocalDate.of(2024, 2, 23), "Праздник весны");


        for (Map.Entry<LocalDate, List<String>> entry : dateEvents.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    // Метод для добавления событий в TreeMap
    private static void addEvent(TreeMap<LocalDate, List<String>> map, LocalDate date, String event) {
        // Если для данной даты уже есть список событий, добавляем событие в этот список
        map.computeIfAbsent(date, k -> new ArrayList<>()).add(event);
    }

}
