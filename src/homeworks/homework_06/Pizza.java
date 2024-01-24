package homeworks.homework_06;

public class Pizza {

    public static double calculatePizzaArea(double diameter) {
        double radius = diameter / 2.0;
        return Math.PI * Math.pow(radius, 2);
    }

    // Можно было создать шаблон double diameter и методы;
    // Cоздать 2 новых экземпляра new Pizza в новом классе и уже там решать...

    public static void main(String[] args) {

        double diameter1 = 24.0;
        double diameter2 = 28.0;

        // Вычисляем площади пицц:

        double area1 = calculatePizzaArea(diameter1);
        double area2 = calculatePizzaArea(diameter2);

        // Вычисляем разницу в площади между двумя пиццами:

        double areaDifference = area2 - area1;

        // Предаем каждому квадратному сантиметру 40 калорий:

        int caloriesPerCentimeter = 40;

        // Вычисляем количество лишних калорий:

        double extraCalories = areaDifference * caloriesPerCentimeter;


        System.out.println("Лишние калории: " + extraCalories);

        // Округлим результат до целого числа:

        System.out.println("Округлим: " + Math.round(extraCalories));

    }
}
