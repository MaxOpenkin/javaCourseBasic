package lessons.lesson_36_generics.genericsPractice.task_2;

public class Circle <T extends Number> implements Figure<T> {

    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double r = radius.doubleValue();
        return Math.PI * r * r;
    }

}
