package lessons.lesson_42_except_string_IO.exception.userException;

import java.util.List;

public class ProductService {

    private final ValidationService validationService;

    public ProductService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public void add(Product product) {

        List<String> validationResult = validationService.validate(product);

        if (validationResult.isEmpty()) {
            System.out.println("Success add new product");
        } else {
            System.out.println(validationResult);
        }
    }

}
