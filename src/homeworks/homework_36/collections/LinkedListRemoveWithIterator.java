package homeworks.homework_36.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListRemoveWithIterator {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 1; i < 10 + 1; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        Set<Integer> indexesToDelete = new HashSet<>();
        indexesToDelete.add(0);
        indexesToDelete.add(1);
        indexesToDelete.add(2);


        Iterator<Integer> iterator = numbers.iterator();
        int index = 0;
        while (iterator.hasNext()){
            iterator.next();
            if (indexesToDelete.contains(index)){
                iterator.remove();
            }
            index++;
        }

        System.out.println("Оставшиеся элементы LinkedList: " + numbers);

    }
}
