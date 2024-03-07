package lessons.lesson_35_dto_optional_final.responseReqestModelDTO.repository;


import lessons.lesson_35_dto_optional_final.responseReqestModelDTO.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepositoryArrayList {
    List<Product> database;

    public ProductRepositoryArrayList() {
        this.database = new ArrayList<>();
    }

    public boolean addProduct(Product newProduct) {
        return database.add(newProduct);
    }

    public List<Product> findAll(){
        return database;
    }

    public Optional<Product> findById(Integer id){

         for (Product currentProduct : database){
             if (id.equals(currentProduct.getId())) {
                 return Optional.of(currentProduct);
             }
         }
         return Optional.empty();
    }
}
