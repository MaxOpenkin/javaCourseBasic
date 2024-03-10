package homeworks.homework_36.generics.listMerge;

import java.util.ArrayList;
import java.util.List;

public class ListMerge {

    // Напишите метод merge, который принимает два отсортированных списка и
    // возвращает объединенный отсортированный список. Используйте Generics
    // для обеспечения возможности передачи в метод списков любого типа.


    public static <T extends Comparable<T>> List<T> merge(List<T> list1, List<T> list2) {
        // Создаем новый список для хранения результата слияния.
        List<T> mergedList = new ArrayList<>();
        // Индексы для текущего элемента каждого из двух списков.
        int index1 = 0, index2 = 0;

        // Продолжаем, пока в обоих списках есть необработанные элементы.
        while (index1 < list1.size() && index2 < list2.size()) {
            // Сравниваем текущие элементы в обоих списках.
            if (list1.get(index1).compareTo(list2.get(index2)) <= 0) {
                // Если элемент из первого списка меньше или равен элементу из второго списка,
                // добавляем его в результирующий список и увеличиваем индекс для первого списка.
                mergedList.add(list1.get(index1++));
            } else {
                // В противном случае, добавляем элемент из второго списка и увеличиваем его индекс.
                mergedList.add(list2.get(index2++));
            }
        }

        // Если в первом списке остались необработанные элементы, добавляем их в результирующий список.
        while (index1 < list1.size()) {
            mergedList.add(list1.get(index1++));
        }

        // Если во втором списке остались необработанные элементы, добавляем их в результирующий список.
        while (index2 < list2.size()) {
            mergedList.add(list2.get(index2++));
        }

        // Возвращаем результирующий список, который теперь содержит все элементы обоих списков в отсортированном порядке.
        return mergedList;
    }
}
