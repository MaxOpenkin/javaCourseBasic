package homeworks.homework_29.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveListToSetAndBackAgain {

    public static void main(String[] args) {

        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Python");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("C#");
        listWithDuplicates.add("Python");

        Set<String> setWithoutDuplicates = new HashSet<>(listWithDuplicates);

        System.out.println("Список без дубликатов: " + setWithoutDuplicates);

        setWithoutDuplicates.add("JavaScript");
        setWithoutDuplicates.add("Go");

        List<String> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);
        System.out.println("Обновленный список: " + listWithoutDuplicates);

    }
}
