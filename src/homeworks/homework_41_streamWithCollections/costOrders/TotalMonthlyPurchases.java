package homeworks.homework_41_streamWithCollections.costOrders;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TotalMonthlyPurchases {

    /*
    Дан список объектов заказов (Order), где каждый заказ содержит список покупок (List) и дату заказа.
    Каждая покупка содержит название товара и его стоимость.
    Необходимо рассчитать общую сумму стоимости всех покупок, сделанных в текущем месяце.
     */

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList(new Purchase("Laptop", 1200.0), new Purchase("Mouse", 25.0)), LocalDate.now()),
                new Order(Arrays.asList(new Purchase("Book", 15.0), new Purchase("Pen", 5.0)), LocalDate.now().minusMonths(1)),
                new Order(Arrays.asList(new Purchase("Desk", 200.0), new Purchase("Chair", 100.0)), LocalDate.now())
        );

        double totalCost = orders.stream()
                .filter(order -> order.getDate().getMonth() == LocalDate.now().getMonth()
                        && order.getDate().getYear() == LocalDate.now().getYear())
                .flatMap(order -> order.getPurchases().stream())
                .mapToDouble(Purchase::getCost)
                .sum();

        System.out.println("Общая сумма стоимости покупок в текущем месяце: " + totalCost);

    }
}
