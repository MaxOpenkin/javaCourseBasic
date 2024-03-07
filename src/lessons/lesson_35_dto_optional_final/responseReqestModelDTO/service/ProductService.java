package lessons.lesson_35_dto_optional_final.responseReqestModelDTO.service;


import lessons.lesson_35_dto_optional_final.responseReqestModelDTO.dto.ProductDto;
import lessons.lesson_35_dto_optional_final.responseReqestModelDTO.dto.ResponseForClientAddProduct;
import lessons.lesson_35_dto_optional_final.responseReqestModelDTO.entity.Product;
import lessons.lesson_35_dto_optional_final.responseReqestModelDTO.repository.ProductRepositoryArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ProductService {

    ProductRepositoryArrayList repository = new ProductRepositoryArrayList();

    public ResponseForClientAddProduct addNewProduct(ProductDto productDto) {
        /*

        - проверить правильность этих данных
        - создать новый экземпляр класса Product
        - передать это новый продукт в репозиторий на запись
         */

        if (!validation(productDto)) {
            
            boolean responseResult = false;
            List<String> responseErrors = new ArrayList<>();
            responseErrors.add("productName не должен быть пустым");
            
            
            return new ResponseForClientAddProduct(responseResult, responseErrors);
        }



        Product newProduct = new Product(1, productDto.getProductName(), productDto.getPrice(), productDto.getDescription());

        boolean responseResult = repository.addProduct(newProduct);

        if (responseResult) {
            return new ResponseForClientAddProduct(responseResult, new ArrayList<>());
        } else {
            return new ResponseForClientAddProduct(responseResult, Arrays.asList("Во время записи данных в базу произошла ошибка"));

        }

    }

    public void findAll(){
        List<Product> products = repository.findAll();

        System.out.println(products);
//        for (Product product : products){
//            System.out.println(product);
//        }
    }



    private boolean validation(ProductDto productDto) {
        if ( productDto.getProductName().isBlank() || productDto.getPrice() < 0 || productDto.getDescription().isBlank()) {
            return false;
        }

        return true;
    }
}
