package homeworks.homework_21.taskWithInheritance_abstract;

import java.util.Arrays;

public class ShapeDemoInherintance {
    public static void main(String[] args) {

        ShapeUtil util = new ShapeUtil();

        // ShapeInputData shapeInputData = new ShapeInputData();

        ShapeService service = new ShapeService();

        /*
        Shape[] shapes = shapeInputData.inputShapesData();
        System.out.println("периметр всех фигур = " + util.calculateAllPerimeters(shapes));
        */

        // Shape[] circles = service.createRandomArrayCircle();
        // System.out.println("Массив с рандомным размером и параметрами фигур типа Круг: " + Arrays.toString(circles));

        Shape[] shapes = service.createRandomShapesArray();
        System.out.println("Массив с рандомными размером, фигурами и параметрами фигур: " + Arrays.toString(shapes));


        System.out.println("Периметр всех фигур = " + util.calculateAllPerimeters(shapes));
        System.out.println("Площадь всех фигур = " + util.calculateAllAreas(shapes));



    }
}
