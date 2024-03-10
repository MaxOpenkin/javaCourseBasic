package homeworks.homework_36.optional;

import java.util.List;
import java.util.Optional;

public class optionalStringList {

    // Напишите метод, который получает список строк и возвращает
    // первую строку в списке, если она существует,
    // или пустую строку в противном случае, используя Optional.

    public static String getFirstString(List<String> strings) {
        return Optional.ofNullable(strings) // Создаем Optional из списка строк
                .filter(list -> !list.isEmpty()) // Проверяем, не пуст ли список
                .map(list -> list.get(0)) // Получаем первый элемент списка, если он есть
                .orElse(""); // Возвращаем пустую строку, если список пуст или равен null
    }

    public static void main(String[] args) {

        List<String> stringsWithValues = List.of("Привет", "Мир", "Java");
        List<String> emptyStringsList = List.of();

        System.out.println(getFirstString(stringsWithValues));
        System.out.println(getFirstString(emptyStringsList));
        System.out.println(getFirstString(null));

    }
}
