package homeworks.homework_40_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringOperationsStream {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Car", "Computer", "Bicycle", "Audi", "Stream");

        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(filteredStrings);

        Optional<String> reduceString = strings.stream()
                //.collect(Collectors.joining(", "));

                .reduce((str1, str2) -> str1 + ", " + str2);

        System.out.println(reduceString);

    }
}
