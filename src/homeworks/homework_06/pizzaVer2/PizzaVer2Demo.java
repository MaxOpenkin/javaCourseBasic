package homeworks.homework_06.pizzaVer2;

import homeworks.homework_06.iStudyBasicJavaVer2.IStudyBasicJavaVer2;

public class PizzaVer2Demo {

    public static void main(String[] args) {

        PizzaVer2 pizza1 = new PizzaVer2(24.0);
        PizzaVer2 pizza2 = new PizzaVer2(28.0);


        double area1 = pizza1.calculatePizzaArea(pizza1.pizzaDiameter);
        double area2 = pizza2.calculatePizzaArea(pizza2.pizzaDiameter);

        System.out.println("Площадь первой пиццы: " + area1);
        System.out.println("Округлим до целого числа: " + Math.round(area1));
        System.out.println("Площадь второй пиццы: " + area2);
        System.out.println("Округлим до целого числа: " + Math.round(area1));

        double areaDifference = area2 - area1;

        System.out.println("Разница в площади между двумя пиццами: " + areaDifference);
        System.out.println("Округлим до целого числа: " + Math.round(areaDifference));

        int caloriesPerCentimeter = 40;

        double extraCalories = areaDifference * caloriesPerCentimeter;

        System.out.println("Предаем каждому квадратному сантиметру 40 калорий и вычисляем количество лишних калорий: " + extraCalories);


        // Округлим результат до целого числа:

        System.out.println("Округлим до целого числа: " + Math.round(extraCalories));

    }
}
