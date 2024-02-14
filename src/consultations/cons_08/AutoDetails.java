package consultations.cons_08;

public class AutoDetails extends Good{
    public AutoDetails(int id, String catalogNumber, String goodName, String producer) {
        super(id, catalogNumber, goodName, producer,"AutoDetails");
    }

    @Override
    void checkGoodOnWarehouse() {

    }
}
