package homeworks.homework_30_compareSort.suitcaseWithEnum;

import java.util.LinkedList;
import java.util.TreeSet;

public class SuitcaseDemo {

    public static void main(String[] args) {

        SuitcaseComparator comparator = new SuitcaseComparator();

        TreeSet<Suitcase> treeSet = new TreeSet<>(comparator);
        LinkedList<Suitcase> linkedList = new LinkedList<>();

        treeSet.add(new Suitcase(Suitcase.Material.FABRIC, Suitcase.Size.L, "Red"));
        treeSet.add(new Suitcase(Suitcase.Material.PLASTIC, Suitcase.Size.M, "Blue"));
        treeSet.add(new Suitcase(Suitcase.Material.FABRIC, Suitcase.Size.XL, "Green"));

        linkedList.add(new Suitcase(Suitcase.Material.FABRIC, Suitcase.Size.L, "Red"));
        linkedList.add(new Suitcase(Suitcase.Material.PLASTIC, Suitcase.Size.M, "Blue"));
        linkedList.add(new Suitcase(Suitcase.Material.FABRIC, Suitcase.Size.XL, "Green"));

        linkedList.sort(comparator);

        System.out.println("TreeSet:");
        treeSet.forEach(System.out::println);

        System.out.println("\nLinkedList:");
        linkedList.forEach(System.out::println);

    }
}
