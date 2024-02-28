package homeworks.homework_29_list_map_set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesSet {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Рудик");
        names.add("Алла");
        names.add("Гриша");
        names.add("Мария");
        names.add("Алла");
        names.add("Максат");
        names.add("Женис");
        names.add("Ольга");
        names.add("Рудик");
        names.add("Жанат");

        System.out.println("Всего 10 имен.");
        System.out.println("Количество уникальных имен в наборе: " + names.size());
        System.out.println(names);


        String nameToCheck = "Рудик";
        System.out.println("Приверяем набор, содержит ли он имя: " + nameToCheck);
        if (names.contains(nameToCheck)){
            System.out.println("Набор содержит имя " + nameToCheck);
        } else {
            System.out.println("Набор не содержит имя " + nameToCheck);
        }

    }
}
