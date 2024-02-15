package homeworks.homework_21.shapes;


public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return " Circle: {" +
                "Radius: " + radius +
                ", Area: " + calculatorArea() +
                ", Perimeter: " + calculatorPerimeter() +
                "} ";
    }

    @Override
    public double calculatorArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatorPerimeter(){
        return 2* Math.PI * radius;
    }
}


