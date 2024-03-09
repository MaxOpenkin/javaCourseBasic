package homeworks.homework_36.generics.boxPutGet;

public class Box<T> {

    // Создайте класс Box для хранения любых объектов и реализуйте методы
    // get() и put() для чтения и записи объектов в коробку.
    // Используйте Generics для обеспечения типобезопасности.

    private T object;

    public void put (T object) {
        this.object = object;
    }

    public T get () {
        return object;
    }

    // T является типовым параметром, который будет заменён на реальный тип объекта при создании экземпляра класса Box.
    // Метод put(T object) принимает объект типа T и сохраняет его в переменной object.
    // Метод get() возвращает объект, хранящийся в Box, типа T.
}
