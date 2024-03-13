package homeworks.homework_40_stream.productAvgPrice;

public class Product {

    // Дана коллекция Product - название, категория, цена, количество на складе.
    // Найти среднюю цену продуктов каждой категории,
    // у которых количество превышает заданное значение и отсортировать по убыванию цены

    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

