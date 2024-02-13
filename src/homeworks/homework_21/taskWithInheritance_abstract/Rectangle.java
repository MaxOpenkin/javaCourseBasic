package homeworks.homework_21.taskWithInheritance_abstract;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return " Rectangle {" +
                "sideA: " + sideA +
                ", sideB: " + sideB +
                ", Area: " + calculatorArea() +
                ", Perimeter: " + calculatorPerimeter() +
                '}';
    }

    @Override
    public double calculatorArea(){
        return sideA * sideB;
    }

    @Override
    public double calculatorPerimeter(){
        return 2 * ( sideA + sideB );
    }
}
