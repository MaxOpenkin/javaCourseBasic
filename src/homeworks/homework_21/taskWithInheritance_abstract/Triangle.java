package homeworks.homework_21.taskWithInheritance_abstract;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return " Triangle {" +
                "sideA: " + sideA +
                ", sideB: " + sideB +
                ", sideC: " + sideC +
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
        return ( sideA + sideB + sideC);
    }
}
