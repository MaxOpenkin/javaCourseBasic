package homeworks.homework_36.collections;

import java.util.HashSet;

public class HashSetSearchString {
    public static void main(String[] args) {

        HashSet<String> stringsSet = new HashSet<>();

        stringsSet.add("Корабль");
        stringsSet.add("Тигр");
        stringsSet.add("Наковальня");
        stringsSet.add("Ноутбук");

        String searchFor = "Тигр";

        System.out.println(stringsSet);

        System.out.println("Выполняется поиск строки \"" + searchFor + "\" ...");

        if (stringsSet.contains(searchFor)){
            System.out.println("Коллекция содержит строку: \"" + searchFor + "\"");
        } else {
            System.out.println("Коллекция не содержит строку: \"" + searchFor + "\"");
        }
    }
}
