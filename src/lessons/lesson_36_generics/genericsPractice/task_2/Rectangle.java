package lessons.lesson_36_generics.genericsPractice.task_2;

public class Rectangle <T extends Number> implements Figure<T> {

    private T length;
    private T width;

    public Rectangle(T length, T width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length.doubleValue() * width.doubleValue();
    }

}
