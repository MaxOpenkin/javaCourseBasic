package consultations.cons_13.shoppinglist.repository;


import consultations.cons_13.shoppinglist.dto.ProductDto;
import consultations.cons_13.shoppinglist.entity.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductRepositoryArrayList implements ProductRepository{

    private List<Product> database;     // Создаем список для хранения объектов Product.

    private Integer idCounter;          // Счетчик для уникальных идентификаторов продуктов.

    public ProductRepositoryArrayList() {
        this.database = new ArrayList<>();     // Инициализируем список продуктов.
        this.idCounter = 0;                     // Инициализируем счетчик идентификаторов.
    }

    @Override
    public Integer addProduct(ProductDto productDto) {
        idCounter++;                                   // Увеличиваем счетчик ID на 1.

        // Добавляем новый продукт в список. Создаем новый объект Product, используя следующий уникальный ID и данные из DTO.

        database.add(new Product(idCounter, productDto.getProductName(), productDto.getPrice(), productDto.getDescription()));
        return idCounter;                              // Возвращаем ID добавленного продукта.
    }

    @Override
    public List<Product> findAll() {
        return database;                                // Возвращаем список всех продуктов.
    }

    @Override
    public Product findById(Integer id) {

        // Проходим по списку продуктов.

        for (Product currentProduct : database) {
            if (currentProduct.getId().equals(id)) {    // Если ID текущего продукта совпадает с искомым ID...
                return currentProduct;                  // Возвращаем этот продукт.
            }
        }

        return null;                                    // Если продукт с таким ID не найден, возвращаем null.
    }

    @Override
    public boolean deleteById(Integer id) {
        Iterator<Product> iterator = database.iterator();   // Создаем итератор для списка продуктов.
        while (iterator.hasNext()) {                // Пока в списке есть элементы...
            Product product = iterator.next();      // Получаем следующий продукт.
            if (product.getId().equals(id)) {       // Если ID продукта совпадает с искомым ID...
                iterator.remove();                  // Удаляем этот продукт из списка.
                return true;                        // Возвращаем true, указывая на успешное удаление.
            }
        }

        return false;                           // Если продукт с таким ID не найден, возвращаем false.
    }
}
