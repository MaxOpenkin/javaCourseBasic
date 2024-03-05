package homeworks.homework_36.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(23);
        numbers.add(5);
        numbers.add(8);
        numbers.add(14);
        numbers.add(3);
        numbers.add(12);
        numbers.add(34);
        numbers.add(7);
        numbers.add(19);
        numbers.add(28);
        numbers.add(1);

        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);


    }
}
