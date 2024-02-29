package lessons.lesson_33_treeMap.practice.productCatalog;

public class ProductsApp {
    public static void main(String[] args) {

        ProductCatalog catalog = new ProductCatalog();

        Product product1 = new Product("Молоко", 1.50);
        Product product2 = new Product("Хлеб", 0.99);
        Product product3 = new Product("Сыр", 9.99);
        Product product4 = new Product("Виски", 30.0);
        Product product5 = new Product("Пельмени", 12.0);
        Product product6 = new Product("Тушенка", 6.20);


        // Добавляем продукты в каталог
        catalog.addProduct(1, product1);
        catalog.addProduct(2, product2);
        catalog.addProduct(3, product3);
        catalog.addProduct(4, product4);
        catalog.addProduct(5, product5);
        catalog.addProduct(6, product6);
        // Попытка добавить продукт с уже существующим ID
        catalog.addProduct(1, product3);

        // Удаление продукта
        catalog.deleteProduct(2);
        // Попытка удалить несуществующий продукт
        catalog.deleteProduct(7);

        // Поиск продуктов
        System.out.println("Поиск продукта с ID 1: " + catalog.findProduct(1));
        System.out.println("Поиск продукта с ID 3: " + catalog.findProduct(3));

        catalog.printAllProducts();

    }
}
