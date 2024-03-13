package homeworks.homework_40_stream.productAvgPrice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductDemo {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Apple", "Fruits", 1.20, 150),
                new Product("Orange", "Fruits", 0.80, 200),
                new Product("Potato", "Vegetables", 0.50, 300),
                new Product("Carrot", "Vegetables", 0.70, 250),
                new Product("Chicken", "Meat", 5.0, 50),
                new Product("Beef", "Meat", 7.0, 70)
        );

        int filterQuantity = 100;

        Map<String, Double> averagePrices = products.stream()
                .filter(product -> product.getQuantity() > filterQuantity) // Фильтрация по количеству
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));


        averagePrices.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed()) // Сортировка по убыванию средней цены
                .forEach(entry ->
                        System.out.println(entry.getKey() + ": " + String.format("%.2f", entry.getValue()))
                );
    }

}
