package homeworks.homework_36.collections;

import java.util.Stack;

public class StackSearchPosition {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();

        myStack.push(5);
        myStack.push(10);
        myStack.push(15);
        myStack.push(20);
        myStack.push(25);

        System.out.println("Стек  элементов: " + myStack);

        int position = myStack.search(10);
        if (position != -1){
            System.out.println("Элемент '10' присутствует и находится на позиции " + position);
        } else {
            System.out.println("Элемент '10' отсутствует");
        }
    }
}
