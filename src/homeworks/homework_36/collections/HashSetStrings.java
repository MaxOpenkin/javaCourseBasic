package homeworks.homework_36.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetStrings {

    // Создать множество HashSet и добавить в него несколько строк.
    // Затем создать второе множество и добавить в него
    // те же самые строки, но в другом порядке. Затем вывести на консоль только те строки,
    // которые есть в обоих множествах.
    public static void main(String[] args) {

        Set<String> firstSet = new HashSet<>();

        firstSet.add("Компьютер");
        firstSet.add("Ноутбук");
        firstSet.add("Планшет");
        firstSet.add("Смартфон");
        firstSet.add("Приставка");

        System.out.println(firstSet);

        Set<String> secondSet = new HashSet<>();

        secondSet.add("Планшет");
        secondSet.add("Приставка");
        secondSet.add("Смартфон");
        secondSet.add("Компьютер");
        secondSet.add("Ноутбук");

        System.out.println(secondSet);

        firstSet.retainAll(secondSet);

        System.out.println("Строки, присутствующие в обоих множествах: ");
        for (String string : firstSet){
            System.out.println(string);
        }

    }
}
