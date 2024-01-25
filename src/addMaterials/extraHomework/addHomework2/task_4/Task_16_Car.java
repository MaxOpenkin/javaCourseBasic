package addMaterials.extraHomework.addHomework2.task_4;

public class Task_16_Car {

    String model;

    Task_16_Car(String newModel) {

        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class Task_16_CarDemo {

    public static void main(String[] args) {
        Task_16_Car myCar = new Task_16_Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
