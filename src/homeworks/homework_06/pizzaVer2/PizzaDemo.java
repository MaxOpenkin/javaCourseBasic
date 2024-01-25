package homeworks.homework_06.pizzaVer2;

import homeworks.homework_06.iStudyBasicJavaVer2.IStudyBasicJavaVer2;

public class PizzaDemo {

    public static void main(String[] args) {

        // Можно делать с int, тогда будут целые числа или использовать округление, но лучше int

        Pizza pizza1 = new Pizza(24.0, 40.0);
        Pizza pizza2 = new Pizza(28.0, 40.0);

        System.out.println(pizza1); // Выводит адрес пиццы
        System.out.println(pizza2); // Выводит адрес пиццы

        System.out.println(pizza1.pizzaDiameter + " и " + pizza1.caloriesInOneCm); // Выводит диаметр пиццы 1 и калории в см
        System.out.println(pizza2.pizzaDiameter + " и " + pizza2.caloriesInOneCm); // Выводит диаметр пиццы 2 и калории в см

        double caloriesPizza1 = pizza1.totalCaloriesInPizza();
        System.out.println("Калории в первой пицце: " + caloriesPizza1);


        double caloriesPizza2 = pizza2.totalCaloriesInPizza();
        System.out.println("Калории во второй пицце: " + caloriesPizza2);

        // Такой вариант:

        System.out.println("Разница: " + (caloriesPizza2 - caloriesPizza1));

        // Или такой вариант:

        double extraCaloriesPizza2ToPizza1 = caloriesPizza2 - caloriesPizza1;

        System.out.println("Разница c другим вариантом: " + extraCaloriesPizza2ToPizza1);



        // Старый вариант:


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
