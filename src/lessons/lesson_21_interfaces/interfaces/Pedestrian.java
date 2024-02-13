package lessons.lesson_21_interfaces.interfaces;

public class Pedestrian extends Person implements Moving{

     @Override
     public void movement() {
          System.out.println("Пешеход движется по своему");

     }
}
