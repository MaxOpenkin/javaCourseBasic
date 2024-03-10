package homeworks.homework_36.generics.genericsStack;

import java.util.ArrayList;
import java.util.List;

public class StackGeneric<T> {

    // Создайте класс Stack, реализующий стек на основе массива или списка.
    // Используйте Generics для обеспечения типобезопасности и возможности
    // передачи в стек объектов разных типов.

    private List<T> elements;

    public StackGeneric() {
        this.elements = new ArrayList<>();
    }

    public void push (T element){
        elements.add(element);
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Метод для получения размера стека
    public int size() {
        return elements.size();
    }

    // Метод для извлечения элемента из стека
    public T pop() {
        if (isEmpty()) {
            return null; // Возвращаем null, если стек пуст
        }
        return elements.removeLast(); // Удаляем и возвращаем последний элемент
    }

    // Метод для получения элемента на вершине стека без его удаления
    public T peek() {
        if (isEmpty()) {
            return null; // Возвращаем null, если стек пуст
        }
        return elements.getLast(); // Возвращаем последний элемент без удаления
    }


}
