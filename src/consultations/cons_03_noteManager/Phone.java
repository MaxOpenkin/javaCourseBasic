package consultations.cons_03_noteManager;

public class Phone {

    String model;

    public Phone(String model) {
        this.model = model;
    }

    public void printData(){
        System.out.println("Phone model: " + model);
    }

    @Override
    public String toString() {
        return "Phone " +
                "model: " + model;
    }
}
