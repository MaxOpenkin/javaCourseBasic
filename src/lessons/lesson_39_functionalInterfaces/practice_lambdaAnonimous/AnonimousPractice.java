package lessons.lesson_39_functionalInterfaces.practice_lambdaAnonimous;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnonimousPractice {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Maikl", "Laleilo", "Bill", "Olga", "James");

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        for (String name : names) {
            System.out.println(name);
        }

    }
}
