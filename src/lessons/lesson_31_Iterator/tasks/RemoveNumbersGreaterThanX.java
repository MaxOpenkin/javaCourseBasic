package lessons.lesson_31_Iterator.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveNumbersGreaterThanX {
    public static void main(String[] args) {

        List<Number> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
        numbers.add(12);
        numbers.add(14);
        numbers.add(16);
        numbers.add(17);

        //int X = 10;
        //removeNumbersGreaterThanX(numbers, X);

        removeNumbersGreaterThanX(numbers, 10);

        System.out.println(numbers);

    }

    public static void removeNumbersGreaterThanX(List<Number> numbers, int X){
        Iterator<Number> iteratorNumbers = numbers.iterator();

        while (iteratorNumbers.hasNext()){
            Number number = iteratorNumbers.next();
            if(number.intValue() > X){
                iteratorNumbers.remove();
            }
        }
    }

}
