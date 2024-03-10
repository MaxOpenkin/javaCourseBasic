package homeworks.homework_36.generics.listMerge;

import java.util.List;

public class ListMergeDemo {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 3, 5);
        List<Integer> list2 = List.of(2, 4, 6);

        List<Integer> mergedList = ListMerge.merge(list1, list2);
        System.out.println(mergedList);

        List<String> list3 = List.of("apple", "orange");
        List<String> list4 = List.of("banana", "pear", "tangerine");

        List<String> mergedListStrings = ListMerge.merge(list3, list4);
        System.out.println(mergedListStrings);
    }

}
