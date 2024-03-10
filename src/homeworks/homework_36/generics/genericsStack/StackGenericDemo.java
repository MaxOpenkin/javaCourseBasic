package homeworks.homework_36.generics.genericsStack;


import java.util.Stack;

public class StackGenericDemo {

    public static void main(String[] args) {

        StackGeneric<String> stack = new StackGeneric<>();
        stack.push("Какой");
        stack.push("Прекрасный");
        stack.push("День");


        // Извлекаем элементы из стека, пока он не опустеет
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }


        // Попытка извлечь элемент из пустого стека
        String emptyPop = stack.pop();
        if (emptyPop == null) {
            System.out.println("Стек пуст.");
        }


        // Попытка просмотреть элемент на вершине пустого стека
        String emptyPeek = stack.peek();
        if (emptyPeek == null) {
            System.out.println("В стеке ничего нет, просмотреть нечего.");
        }

    }
}
