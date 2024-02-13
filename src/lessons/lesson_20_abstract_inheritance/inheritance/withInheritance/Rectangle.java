package lessons.lesson_20_abstract_inheritance.inheritance.withInheritance;

import java.util.Random;

public class Rectangle extends Shape{

    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double calculatorArea(){
        return sideA * sideB;
    }

    @Override
    public double calculatorPerimeter(){
        return 2 * ( sideA + sideB );
    }
}
