package lessons.lesson_03_strukturJava;

public class MethodExample {
    public static void main(String[] args) {
        int result = addNumbers(5, 7);
        // Вызов метода
        System.out.println("Результат сложения: " + result);
    }

    // Определение метода для сложения двух чисел
    static int addNumbers(int a, int b) {
        return a + b;
    }
}