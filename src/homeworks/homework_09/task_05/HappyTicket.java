package homeworks.homework_09.task_05;

import lessons.lesson_06.scanner.UserInput;

public class HappyTicket {
    public static void main(String[] args) {

        // Делаем сканер из пакета scanner.UserInput

        UserInput ui = new UserInput();

        // Считываем введенную строку и сохраняем ее в переменной input

        String input = ui.inputText("Введите четырехзначное число (в формате строки):");

        // Если введенная строка не содержит четыре символа, программа выводит ошибку и завершает выполнение:

        if (input.length() != 4) {
            System.out.println("Ошибка: Введенное число не четырехзначное.");
            return;
        }

        // Программа извлекает каждый символ из введенной строки и преобразует его в число:

        int number1 = Character.getNumericValue(input.charAt(0));
        int number2 = Character.getNumericValue(input.charAt(1));
        int number3 = Character.getNumericValue(input.charAt(2));
        int number4 = Character.getNumericValue(input.charAt(3));

        // Программа проверяет, является ли сумма первых двух цифр равной сумме третьей и четвертой.
        // В зависимости от результата выводится соответствующее сообщение:

        if (number1 + number2 == number3 + number4) {
            System.out.println("Поздравляем! Ваш билет - счастливый!");
        } else {
            System.out.println("Ваш билет не является счастливым.");
        }
    }
}
