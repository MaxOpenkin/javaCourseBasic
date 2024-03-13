package homeworks.homework_41_streamWithCollections;

import java.util.Arrays;
import java.util.List;

public class FilterAndSortStrings {
    public static void main(String[] args) {

        /*
        Дан список строк. Необходимо отфильтровать из этого списка все строки,
        которые начинаются на букву "A" (без учёта регистра), и вернуть список этих строк,
        отсортированный в алфавитном порядке.
         */

        List<String> strings = Arrays.asList("Lol", "good", "Actor", "Table", "String", "apple");

        List<String> filteredAndSorted = strings.stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .sorted()
                .toList();

        System.out.println(filteredAndSorted);
    }
}
