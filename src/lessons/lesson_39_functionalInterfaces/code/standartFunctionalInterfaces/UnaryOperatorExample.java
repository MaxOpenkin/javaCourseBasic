package lessons.lesson_39_functionalInterfaces.code.standartFunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;

        System.out.println(square.apply(5));
    }
}
