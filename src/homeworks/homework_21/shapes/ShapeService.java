package homeworks.homework_21.shapes;


import java.util.Random;

public class ShapeService {

    Random random = new Random();


    public Shape[] createRandomArrayCircle() {

        int size = random.nextInt(11) + 10;
        Shape[] circles = new Shape[size];

        for (int i = 0; i < size; i++) {

            double radius = random.nextDouble() * 25 + 1;
            circles[i] = new Circle(radius);
        }
        return circles;
    }


    private Circle createRandomCircle() {
        double radius = random.nextDouble() * 25 + 1;
        return new Circle(radius);
    }

    private Rectangle createRandomRectangle() {
        double sideA = random.nextDouble() * 25 + 1;
        double sideB = random.nextDouble() * 25 + 1;
        return new Rectangle(sideA,sideB);
    }

    private Square createRandomSquare() {
        double sideA = random.nextDouble() * 25 + 1;
        return new Square(sideA);
    }

    private Triangle createRandomTriangle() {
        double sideA = random.nextDouble() * 25 + 1;
        double sideB = random.nextDouble() * 25 + 1;
        double sideC = random.nextDouble() * 25 + 1;
        return new Triangle(sideA,sideB,sideC);
    }

    private Shape getRandomShape() {
        int randomShape = random.nextInt(4);
        switch (randomShape) {
            case 0:
                return createRandomCircle();
            case 1:
                return createRandomSquare();
            case 2:
                return createRandomTriangle();
            case 3:
                return createRandomRectangle();
            default:
                throw new IllegalStateException("Непредвиденное значение: " + randomShape);
        }
    }

    public Shape[] createRandomShapesArray() {
        int size = random.nextInt(11) + 10;
        Shape[] shapes = new Shape[size];
        for (int i = 0; i < size; i++) {
            shapes[i] = getRandomShape();
        }
        return shapes;
    }


}
