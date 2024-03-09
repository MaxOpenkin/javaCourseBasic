package homeworks.homework_36.generics.printListWithGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class genericsPrinter {

    // Напишите метод printList, который принимает список объектов и
    // выводит их на экран. Используйте Generics для обеспечения
    // типобезопасности и возможности передачи списка объектов любого типа.

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Hi", "I'm", "Max");
        printList(stringList);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        printList(integerList);

        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        printList(doubleList);

    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    // List<?> является примером использования wildcard generics.
    // Знак вопроса ? означает, что мы можем передать список (List) объектов любого типа.
    // Внутри метода printList мы проходим по списку с помощью цикла for-each
    // и выводим каждый элемент списка на экран. Поскольку ? представляет неизвестный тип,
    // мы используем Object в качестве типа элемента списка в цикле.

}
