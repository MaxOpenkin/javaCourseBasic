package homeworks.homework_36.optional;

import java.util.Optional;

public class optionalInteger {

    // Напишите метод, который получает значение типа Integer и
    // возвращает его удвоенное значение, если оно не равно null,
    // используя Optional.


    public static Integer doubleValue(Integer value) {
        // Создаем Optional из переданного значения
        return Optional.ofNullable(value)
                // Применяем функцию удвоения, если значение присутствует
                .map(v -> v * 2)
                // Возвращаем значение, если оно присутствует, иначе возвращаем null
                .orElse(null);
    }

    public static void main(String[] args) {

        Integer value1 = 10;
        Integer result1 = doubleValue(value1);
        System.out.println(result1);

        Integer value2 = null;
        Integer result2 = doubleValue(value2);
        System.out.println(result2);

    }

}
