package lessons.lesson_02;

public class ArithmeticOperation1 {

    public static void main(String[] args) {

        System.out.println("Пример печати на консоль");
        System.out.println("Второй пример " + "печати");

        System.out.println("2 + 2 = " + 4);

        // объявим переменные, произведем с ними операции и распечатаем результат

        int x = 10;
        int y = 5;

        System.out.println("Результат деление int x / y = " + (x / y));

        int resultOfMultiplication = x * y;
        System.out.println("Результат умножения int = " + resultOfMultiplication);


        double xDouble = 10.5;
        double yDoyble = 5.5;

        double doubleResult = xDouble - yDoyble;

        System.out.println("Результат вычитания double = " + doubleResult);
    }
}
