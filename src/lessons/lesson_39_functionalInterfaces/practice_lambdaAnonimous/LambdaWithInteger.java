package lessons.lesson_39_functionalInterfaces.practice_lambdaAnonimous;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaWithInteger {

    public static void main(String[] args) {


    List<Integer> numbers = Arrays.asList(5,7,3,9,15,27,11);

    numbers.sort(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

        for (Integer number : numbers) {
            System.out.println(number);
        }
}}
