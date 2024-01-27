package homeworks.homework_09.task_01;

import lessons.lesson_06.scanner.UserInput;

public class EnterNumber {

    public static void main(String[] args) {

        UserInput ui = new UserInput();

        int number = ui.inputInteger("Введите число 1, 2 или 3: ");

        switch (number) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;

            default:
                System.out.println("Этого я еще не знаю (((");

        }
    }
}
