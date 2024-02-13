package lessons.lesson_20_abstract_inheritance.inheritance.withInheritance;

import java.util.Arrays;

public class ShapeDemoInherintance {
    public static void main(String[] args) {

        ShapeUtil util = new ShapeUtil();
        ShapeInputData shapeInputData = new ShapeInputData();
        ShapeService service = new ShapeService();

        /*
        Shape[] shapes = shapeInputData.inputShapesData();

        System.out.println("периметр всех фигур = " + util.calculateAllPerimeters(shapes));
        */


        Shape[] circles = service.createArrayCircle();
        System.out.println("Массив с фигурами типа Круг: " + Arrays.toString(circles));

    }
}
