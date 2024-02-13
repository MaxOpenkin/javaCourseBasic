package lessons.lesson_21_interfaces.taskPractice.entity.vehicals;

import lessons.lesson_21_interfaces.taskPractice.entity.Engine;
import lessons.lesson_21_interfaces.taskPractice.entity.GearShift;
import lessons.lesson_21_interfaces.taskPractice.entity.MotorizedVehicle;

public class Moto extends MotorizedVehicle {
    public Moto(String model, Integer speed, Engine engine, GearShift gearShift) {
        super(model, speed, engine, gearShift);
    }
}
