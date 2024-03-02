package homeworks.homework_32_stack_queue_deque.practice;

import java.util.HashMap;
import java.util.Map;
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


        System.out.println("Используя Stack и if / else в цикле for i: ");
        for (String arrayElement : stringsForTest) {
            System.out.println(arrayElement + ": " + isCorrectBracketWithIf(arrayElement));
        }


        System.out.println("Используя Switch / case в цикле for i: ");
        for (String arrayElement : stringsForTest) {
            System.out.println(arrayElement + ": " + isCorrectBracketWithSwitch(arrayElement));
        }


        System.out.println("Используя Map и if / else в цикле for each: ");
        for (String arrayElement : stringsForTest) {
            System.out.println(arrayElement + ": " + isCorrectBracketWithMap(arrayElement));
        }

    }


    // Вариант 1:
    /*
    Первый вариант (прямой подход с использованием стека):
    Этот метод является прямым и понятным.
    Он включает в себя явное сравнение скобок и требует дополнительного условия для каждого типа скобок.
    Хотя он легко читаем и понятен, количество условных операторов увеличивается с добавлением новых типов скобок,
    что может негативно сказаться на поддержке и расширяемости кода.
     */

    public static boolean isCorrectBracketWithIf(String stringLine) {
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
     /*
    Второй вариант (использование стека с "ожидаемыми" закрывающими скобками):
    Этот подход упрощает проверку, поскольку требует лишь сопоставления текущей скобки с вершиной стека,
    без необходимости определять тип скобки.
    Это делает код короче и потенциально более быстрым за счет уменьшения количества операций сравнения.
    Однако, как и в первом случае, добавление новых типов скобок требует изменения логики добавления в стек.
     */

    public static boolean isCorrectBracketWithSwitch(String stringLine) {
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


    // Вариант 3:
    /*
    Третий вариант (использование карты для сопоставления скобок и стека):
    Этот метод является самым оптимальным с точки зрения читаемости, поддержки и расширяемости.
    Использование карты позволяет легко добавлять новые типы скобок без изменения основной логики алгоритма.
    С точки зрения производительности,
    разница с предыдущими методами может быть незначительной для малых и средних размеров входных данных,
    но преимущество в удобстве поддержки и модификации кода делает его предпочтительным выбором.
     */

    public static boolean isCorrectBracketWithMap(String stringLine) {
        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put('}', '{');
        bracketsMap.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char ch : stringLine.toCharArray()) {
            if (bracketsMap.containsValue(ch)) {
                stack.push(ch);
            } else if (bracketsMap.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != bracketsMap.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


     /*
    С точки зрения производительности, все три метода имеют схожую сложность — O(n),
    где n — длина входной строки, так как каждый из них проходит по строке один раз.
    Однако, с учетом оптимальности (удобства поддержки и расширяемости),
    третий вариант с использованием карты для сопоставления скобок и стека является предпочтительным.
    Он обеспечивает более чистый и модульный код, упрощает добавление новых типов скобок и улучшает читаемость.
     */


}
