package lessons.lesson_32_stack_queue_deque.practice;

import java.util.Stack;
public class StackCorrectBracket {

    public static void main(String[] args) {
        String[] stringsForTest = {
                "(){}[]",
                "({})",
                "{[]([])}",
                "([)]",
                "{[(])}"
        };

        for (String arrayElement : stringsForTest) {
            System.out.println(arrayElement + ": " + isCorrectBracket(arrayElement));
        }

        for (String arrayElement : stringsForTest) {
            System.out.println(arrayElement + ": " + isCorrectBracket2(arrayElement));
        }

    }


    // Вариант 1:

    public static boolean isCorrectBracket(String stringLine) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stringLine.length(); i++) {
            char ch = stringLine.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.empty()) {
                    return false;
                }
                char last = stack.peek();
                if ((ch == ')' && last == '(') ||
                        (ch == '}' && last == '{') ||
                        (ch == ']' && last == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }


    // Вариант 2:

    public static boolean isCorrectBracket2(String stringLine) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stringLine.length(); i++) {
            char ch = stringLine.charAt(i);

            switch (ch) {
                case '(':
                    stack.push(')'); // Ожидаем закрывающую скобку
                    break;
                case '{':
                    stack.push('}'); // Ожидаем закрывающую скобку
                    break;
                case '[':
                    stack.push(']'); // Ожидаем закрывающую скобку
                    break;
                default: // Для закрывающих скобок
                    if (stack.isEmpty() || stack.pop() != ch) {
                        return false; // Стек пуст или верхний элемент стека не соответствует текущей закрывающей скобке
                    }
            }
        }
        return stack.isEmpty(); // Если стек пуст, скобки сбалансированы
    }


}
