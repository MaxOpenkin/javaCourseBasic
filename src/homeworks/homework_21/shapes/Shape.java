package homeworks.homework_21.shapes;

public abstract class Shape {
    private String title;

    public Shape() {
    }

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculatorArea();

    abstract double calculatorPerimeter();
}
