package homeworks.homework_09.task_03;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class SwitchNumbersAndDays {

    public static void main(String[] args) {

        UserInput ui = new UserInput();

        int number = ui.inputInteger("Введите номер дня недели от 1 до 7: ");

        switch (number) {
            case 1:
                System.out.println("Сегодня Понедельник - день тяжелый");
                break;
            case 2:
                System.out.println("Сегодня Вторник");
                break;
            case 3:
                System.out.println("Сегодня Среда");
                break;
            case 4:
                System.out.println("Сегодня Четверг");
                break;
            case 5:
                System.out.println("Сегодня Пятница - развратница :)");
                break;
            case 6:
                System.out.println("Сегодня Суббота - выходной");
                break;
            case 7:
                System.out.println("Сегодня Воскресенье - выходной");
                break;

            default:
                System.out.println("Ты чего? В неделе всего 7 дней :)");

        }
    }
}
