package homeworks.homework_09.task_02;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        // Объект Random создан для генерации случайных чисел
        Random random = new Random();

        int number1 = random.nextInt(101);
        int number2 = random.nextInt(101);
        int number3 = random.nextInt(101);
        int number4 = random.nextInt(101);
        // Указываем случайное число до 101, потому что счет идет от 0 до 101 (где 101 не включительно)

        System.out.println("Случайные числа: " + number1 + ", " + number2 + ", " + number3 + ", " + number4);

        // Определяем максимальное из четырех чисел, сначала из первой пары чисел затем из второй пары чисел
        int max = Math.max(Math.max(number1, number2), Math.max(number3, number4));

        System.out.println("Максимальное число с Math.max: " + max);


        // Вариант решения №2 с помощью оператора if (более примитивный вариант):

        int newMax = number1; // Предполагаем, что number1 - максимальное число

        // Проверяем, если number2 больше number1 (newMax), обновляем newMax, то далее он будет большим числом
        if (number2 > newMax) {
            newMax = number2;
        }

        // Проверяем, если number3 больше number2 (newMax), обновляем newMax, то далее он будет большим числом
        if (number3 > newMax) {
            newMax = number3;
        }

        // Проверяем, если number4 больше number3 (newMax), обновляем newMax, то далее он будет большим числом
        if (number4 > newMax) {
            newMax = number4;
        }

        // Тем самым newMax сравнил себя со всеми числами и большему из них присвоил свое значение

        System.out.println("Максимальное число с if: " + newMax);
    }
   }
