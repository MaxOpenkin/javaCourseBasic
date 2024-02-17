package lessons.lesson_23.autoService.service;


import lessons.lesson_23.autoService.entity.Car;
import lessons.lesson_23.autoService.entity.Vehicle;

public class ServiceManager {
    // размер количества автомобилей на одновременном ремонте
    private Vehicle[] vehicles = new Vehicle[10];

    // размер работ
    private Serviceable[] serviceables = new Serviceable[10];

    private int vehicleCounter = 0;
    private int serviceCounter = 0;


    public void addVehicle(Car vehicle){
        if (vehicleCounter < vehicles.length) {
            vehicles[vehicleCounter] = vehicle;
            vehicleCounter++;
            System.out.println("Vehicle added: ");
            vehicle.showInfo();
        } else {
            System.out.println("Service is full, cannot add more vehicles!");
        }
    }

    public void assignService(Vehicle vehicle, String workDescription){

        if (serviceCounter < serviceables.length) {

            if (workDescription.toLowerCase().contains("repair")) {
                serviceables[serviceCounter] = new Repair(workDescription);
            }

            if (workDescription.toLowerCase().contains("paint")) {
                serviceables[serviceCounter] = new Painted(workDescription);
            }

            serviceCounter++;

            System.out.println("Service started for " + vehicle.getBrand() + " " + vehicle.getModel() + " - " + workDescription);
        } else {
            System.out.println("Cannot assign more services, limit reached!");

        }
    }

    public void printServiceStatus(int orderNumber){
        System.out.println(serviceables[orderNumber].getWorkStatus());
    }

    public void changeServiceStatus(int orderNumber, String newStatus){
        serviceables[orderNumber].changeWorkStatus(newStatus);
    }


}
