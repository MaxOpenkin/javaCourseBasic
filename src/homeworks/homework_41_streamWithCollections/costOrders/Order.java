package homeworks.homework_41_streamWithCollections.costOrders;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private List<Purchase> purchases;
    private LocalDate date;

    public Order(List<Purchase> purchases, LocalDate date) {
        this.purchases = purchases;
        this.date = date;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public LocalDate getDate() {
        return date;
    }

}
