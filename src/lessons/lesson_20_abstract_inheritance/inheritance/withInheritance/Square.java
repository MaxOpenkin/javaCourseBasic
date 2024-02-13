package lessons.lesson_20_abstract_inheritance.inheritance.withInheritance;

public class Square  extends Shape{

    private double sideA;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    @Override
    public double calculatorArea(){
        return sideA * sideA;
    }

    @Override
    public double calculatorPerimeter(){
        return 4 *  sideA;
    }
}
