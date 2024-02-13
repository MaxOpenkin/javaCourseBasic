package lessons.lesson_20_abstract_inheritance.inheritance.withInheritance;


import java.util.Random;

public class ShapeService {

    Random random = new Random();
    //int size = random.nextInt();
    //int size = 0;
    //int size = random.nextInt() * 10;

   /* public Circle[] createArrayCircle(int size){
        //int size = random.nextInt() * 10;
        Circle[] circles = new Circle[size];
        //double radius = random.nextDouble() * 25;
        for (int i = 0; i < size; i++) {
            //double circleRadius = random.nextInt() * 10;
            circles[i] = random.nextInt(6);

        }
        return circles;
    }

    */
   public Shape[] createArrayCircle(){

       int size = random.nextInt(11) + 10;
       Shape[] circles = new Shape[size];

       for (int i = 0; i < size; i++) {

           double radius = random.nextDouble() * 25;
           circles[i] = new Circle(radius);
       }
       return circles;
   }

}
