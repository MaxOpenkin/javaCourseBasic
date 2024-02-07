package lessons.lesson_12_removeSymbols;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class TemperaturCheck {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        int temperature1 = userInput.inputInteger("Введите температуру 1: ");
        int temperature2 = userInput.inputInteger("Введите температуру 2: ");

        boolean isDeviceWorking = checkDevice(temperature1, temperature2);
        System.out.println("Устройство работает корректно: " + isDeviceWorking);

    }
    private static boolean checkDevice(double temperature1, double temperature2) {
        // Проверяем, соответствуют ли температуры условиям работы устройства
        boolean condition1 = temperature1 > 100;
        boolean condition2 = temperature2 < 100;

        // Возвращаем результат проверки
        return condition1 && condition2;
    }
}
