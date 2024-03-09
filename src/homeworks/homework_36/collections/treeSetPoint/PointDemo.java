package homeworks.homework_36.collections.treeSetPoint;

import java.util.TreeSet;

public class PointDemo {
    public static void main(String[] args) {

        TreeSet<Point> points = new TreeSet<>();

        // Добавление объектов Point в TreeSet
        points.add(new Point(3, 2));
        points.add(new Point(1, 4));
        points.add(new Point(5, 5));
        points.add(new Point(2, 1));
        points.add(new Point(4, 3));


        // Перебор всех элементов множества и вывод на консоль точек, у которых x > y
        System.out.println("Точки, у которых x > y:");
        for (Point point : points) {
            if (point.getX() > point.getY()) {
                System.out.println(point);
            }
        }
    }

}
