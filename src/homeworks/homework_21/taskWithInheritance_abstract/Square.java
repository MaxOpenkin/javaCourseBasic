package homeworks.homework_21.taskWithInheritance_abstract;

public class Square  extends Shape {

    private double sideA;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String toString() {
        return " Square {" +
                "sideA: " + sideA +
                ", Area: " + calculatorArea() +
                ", Perimeter: " + calculatorPerimeter() +
                '}';
    }

    @Override
    public double calculatorArea(){
        return sideA * sideA;
    }

    @Override
    public double calculatorPerimeter(){
        return 4 *  sideA;
    }
}
