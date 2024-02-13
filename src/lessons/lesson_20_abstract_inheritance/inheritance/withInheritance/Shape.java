package lessons.lesson_20_abstract_inheritance.inheritance.withInheritance;

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
