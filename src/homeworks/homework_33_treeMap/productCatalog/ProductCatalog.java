package homeworks.homework_33_treeMap.productCatalog;

import java.util.Map;
import java.util.TreeMap;

public class ProductCatalog {

    TreeMap<Integer, Product> products = new TreeMap<>();

    public ProductCatalog() {
        this.products = new TreeMap<>();
    }


    public void addProduct(int productId, Product product) {
        if (products.containsKey(productId)) {
            System.out.println("Ошибка: Продукт с ID " + productId + " уже существует.");
        } else {
            products.put(productId, product);
            System.out.println("Продукт добавлен: " + product);
        }
    }


    public void deleteProduct(int productId) {
        if(products.remove(productId) == null){
            System.out.println("Ошибка: Продукт с ID " + productId + " не найден.");
        } else {
            System.out.println("Продукт с ID " + productId + " удален.");
        }
    }


    public Product findProduct(int productId){
        if (!products.containsKey(productId)){
            System.out.println("Ошибка: Продукт с ID " + productId + " не найден.");
            return null;
        } else {
            return products.get(productId);
        }
    }


    public void printAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Каталог продуктов пуст.");
        } else {
            System.out.println("Каталог продуктов:");
            for (Map.Entry<Integer, Product> entry : products.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
            }
        }
    }


}
