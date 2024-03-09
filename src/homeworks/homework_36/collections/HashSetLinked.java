package homeworks.homework_36.collections;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetLinked {

    public static void main(String[] args) {

        HashSet<String> myHashSet = new HashSet<>();

        myHashSet.add("Element1");
        myHashSet.add("Element2");
        myHashSet.add("Element3");
        myHashSet.add("Element4");

        LinkedList<String> linkedList = new LinkedList<>(myHashSet);

        System.out.println("Элементы LinkedList в порядке добавления:");
        for (String element : linkedList){
            System.out.println(element);
        }
        
    }
}
