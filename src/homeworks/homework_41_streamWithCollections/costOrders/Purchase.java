package homeworks.homework_41_streamWithCollections.costOrders;

public class Purchase {

    private String productName;
    private double cost;

    public Purchase(String productName, double cost) {
        this.productName = productName;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

}
