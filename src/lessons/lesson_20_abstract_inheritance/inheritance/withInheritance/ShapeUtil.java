package lessons.lesson_20_abstract_inheritance.inheritance.withInheritance;

public class ShapeUtil {

    public double calculateAllAreas(Shape[] shapes){
        double allAreas = 0;

        for (int i = 0; i < shapes.length; i++) {
            allAreas = allAreas + shapes[i].calculatorArea();
        }
        return allAreas;
    }


    public double calculateAllPerimeters(Shape[] shapes) {
        double allPerimeters = 0;

        for (int i = 0; i < shapes.length; i++) {
            allPerimeters = allPerimeters + shapes[i].calculatorPerimeter();
        }
        return allPerimeters;
    }

}
