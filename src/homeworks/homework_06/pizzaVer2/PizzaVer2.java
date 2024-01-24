package homeworks.homework_06.pizzaVer2;

public class PizzaVer2 {

    double pizzaDiameter;


    public PizzaVer2(double pizzaDiameter) {
        this.pizzaDiameter = pizzaDiameter;
    }

    public double calculatePizzaArea(double diameter) {
        double radius = diameter / 2.0;
        return Math.PI * Math.pow(radius, 2);
    }

}