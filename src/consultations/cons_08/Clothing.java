package consultations.cons_08;

public class Clothing extends Good{


    public Clothing(int id, String catalogNumber, String goodName, String producer) {
        super(id, catalogNumber, goodName, producer, "Clothing");
    }

    @Override
    void checkGoodOnWarehouse() {

    }
}
