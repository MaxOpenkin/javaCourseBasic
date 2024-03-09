package homeworks.homework_36.collections.treeSetPoint;

public class Point implements Comparable<Point> {

    // Создать множество TreeSet и добавить в него несколько объектов класса Point,
    // у которых есть свойства x и y.
    // Затем перебрать все элементы множества и вывести на консоль только те точки, у которых x > y.

    private int x;
    private int y;

    // Конструктор
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.x != other.x) {
            return Integer.compare(this.x, other.x);
        } else {
            return Integer.compare(this.y, other.y);
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
