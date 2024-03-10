package homeworks.homework_36.generics.optionalGeneric;

import java.util.Optional;

public class OptionalGeneric <T> {

    // Создайте класс Optional для представления значения, которое может
    // отсутствовать. Реализуйте методы isPresent(), get() и orElse().
    // Используйте Generics для возможности хранения в Optional объектов
    // разных типов.

    private T value;

    private OptionalGeneric(T value) {
        this.value = value;
    }

    // Статический метод для создания Optional с значением.
    public static <T> OptionalGeneric<T> of(T value) {
        return new OptionalGeneric<>(value);
    }

    // Статический метод для создания пустого Optional.
    public static <T> OptionalGeneric<T> empty() {
        return new OptionalGeneric<>(null);
    }

    // Метод проверяет, присутствует ли значение.
    public boolean isPresent() {
        return value != null;
    }

    // Возвращает значение, если оно присутствует, иначе возвращает null.
    public T get() {
        return value;
    }

    // Возвращает значение, если оно присутствует, иначе возвращает другое значение, переданное в качестве параметра.
    public T orElse(T other) {
        return value != null ? value : other;
    }

}
