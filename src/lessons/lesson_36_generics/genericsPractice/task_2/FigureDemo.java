package lessons.lesson_36_generics.genericsPractice.task_2;

public class FigureDemo {

    public static void main(String[] args) {


        // Создаем круг с радиусом Integer
        Circle<Integer> circleInt = new Circle<>(5);
        System.out.println("Площадь круга с радиусом Integer: " + circleInt.area());


        // Создаем круг с радиусом Double
        Circle<Double> circleDouble = new Circle<>(5.5);
        System.out.println("Площадь круга с радиусом Double: " + circleDouble.area());


        // Создаем прямоугольник с длиной и шириной Integer
        Rectangle<Integer> rectangleInt = new Rectangle<>(4, 7);
        System.out.println("Площадь прямоугольника с длиной и шириной Integer: " + rectangleInt.area());


        // Создаем прямоугольник с длиной и шириной Double
        Rectangle<Double> rectangleDouble = new Rectangle<>(4.5, 7.5);
        System.out.println("Площадь прямоугольника с длиной и шириной Double: " + rectangleDouble.area());
    }

}
