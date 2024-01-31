package homeworks.homework_11;

import lessons.lesson_06.scanner.UserInput;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int number = userInput.inputInteger("Введите число для проверки: ");
        boolean isPrime = true;
        int delitel = 1;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0){
                isPrime = false;
                delitel = i;
                break;
            }
        }

        if (isPrime){
            System.out.println(number + " является простым числом.");
        } else {
            System.out.println(number + " не является простым числом.");
            System.out.println(delitel + " его делитель.");
        }
    }
}
/*
Программа проверяет, делится ли введенное число на какое-либо число от 2 до половины введенного числа (включительно).
Если оно делится, то оно не является простым числом. В конце программа выводит результат проверки.
 */
