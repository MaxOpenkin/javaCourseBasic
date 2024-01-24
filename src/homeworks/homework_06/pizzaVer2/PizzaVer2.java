package homeworks.homework_06.pizzaVer2;

public class PizzaVer2 {

    double pizzaDiameter;
    double caloriesInOneCm;


    public PizzaVer2(double pizzaDiameter, double caloriesInOneCm) {
        this.pizzaDiameter = pizzaDiameter;
        this.caloriesInOneCm = caloriesInOneCm;
    }

    public double calculatePizzaArea(double diameter) {
        double radius = diameter / 2.0;
        return Math.PI * Math.pow(radius, 2);
    }

    public double totalCaloriesInPizza(){
        double caloriesPizza = caloriesInOneCm * Math.PI * (pizzaDiameter * pizzaDiameter) / 4;
        return caloriesPizza;
    }

}