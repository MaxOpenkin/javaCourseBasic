package lessons.lesson_42.exception.userException;

public class ProductValidationException extends RuntimeException{
    public ProductValidationException(String message) {
        super(message);
    }
}
