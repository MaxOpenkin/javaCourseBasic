package addMaterials.extraHomework.addHomework3.discount;

public class ProductDemo {

    public static void main(String[] args) {

        // Создание объекта класса Product
        Product product = new Product("Молоко");

        // Задание стандартной цены и скидки через оператор "."
        product.setRegularPrice(0.80);
        product.setDiscount(20);

        // Вывод информации о продукте
        product.printInformation();
    }

}
