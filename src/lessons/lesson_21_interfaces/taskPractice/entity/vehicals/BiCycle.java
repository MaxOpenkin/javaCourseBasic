package lessons.lesson_21_interfaces.taskPractice.entity.vehicals;

import lessons.lesson_21_interfaces.taskPractice.entity.GearShift;
import lessons.lesson_21_interfaces.taskPractice.entity.NonMotorizedVehicle;
import lessons.lesson_21_interfaces.taskPractice.interfaces.GearShiftOperations;

public class BiCycle extends NonMotorizedVehicle implements GearShiftOperations {
    private GearShift gearShift;

    public BiCycle(String model, Integer speed, GearShift gearShift) {
        super(model, speed);
        this.gearShift = gearShift;
    }


    @Override
    public void changeGear(boolean isUp) {
        Integer currentGear = gearShift.getCurrentGear();

        if (isUp) {
            gearShift.setCurrentGear(currentGear + 1);
        } else {
            gearShift.setCurrentGear(currentGear - 1);
        }
    }
}
