package addMaterials.extraHomework.addHomework2.task_3;

public class Task_15_Phone {

    String model;

        Task_15_Phone(String newModel) {
            this.model = newModel;
        }

        String getModel() {
            return this.model;
        }

    }

    class Task_15_PhoneDemo {

        public static void main(String[] args) {
            Task_15_Phone myPhone = new Task_15_Phone("Huawei");
            String model = myPhone.getModel();
            System.out.println("Phone model - " + model);
        }
}
