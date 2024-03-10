package homeworks.homework_36.generics.optionalGeneric;

import java.util.Optional;

public class OptionalGenericDemo {

    public static void main(String[] args) {

        OptionalGeneric<String> myString = OptionalGeneric.of("Привет, Optional!");
        System.out.println(myString.isPresent() ? myString.get() : "Строка отсутствует");

        OptionalGeneric<String> emptyString = OptionalGeneric.empty();
        System.out.println(emptyString.orElse("Пустой Optional"));

    }

}
