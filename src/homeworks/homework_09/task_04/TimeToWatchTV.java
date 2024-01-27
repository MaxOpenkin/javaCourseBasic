package homeworks.homework_09.task_04;

import java.util.Random;

public class TimeToWatchTV {

    public static void main(String[] args) {

        Random random = new Random();

        int grade = random.nextInt(13); // Генерация случайного числа для оценки (grade) от 0 до 12
        int remainingTime = 45; // Задаем оставшееся время (remainingTime) для просмотра ТВ (в минутах)

        System.out.println("Оценка по математике: " + grade);

        switch (grade){
            case 10:
            case 11:
            case 12:
                System.out.println("Да ты гений!!!");
                remainingTime += 60;
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Пойдет, но мог бы и лучше.");
                remainingTime += 45;
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Эх, ну ничего, троишники тоже добиваются успеха, но смотрят меньше телевизор :)");
                remainingTime += 15;
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("Ты меня расстраиваешь, сынок. Минус 30 минут к оставшемуся времени.");
                remainingTime -= 30;
                break;
            case 0:
                System.out.println("Трагедия. Сегодня ТВ смотреть запрещено! Мать вызови мне скорую!!!");
                remainingTime = 0;
                break;
            default:
                System.out.println("Ты сочиняешь, сынок. В вашей школе нет таких оценок.");

        }
        System.out.println("Твое время для просмотра ТВ: " + remainingTime + " минут");
    }
}
