package consultations.cons_13.shoppinglist.repository;


import consultations.cons_13.shoppinglist.dto.ProductDto;
import consultations.cons_13.shoppinglist.entity.Product;

import java.util.List;

public interface ProductRepository {

    Integer addProduct(ProductDto productDto);
    List<Product> findAll();
    Product findById(Integer id);
    boolean deleteById(Integer id);
}
