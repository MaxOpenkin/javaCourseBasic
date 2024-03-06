package consultations.cons_13.shoppinglist.dto.error;

public enum ErrorCode {

    IE_500("Internal Server Error", 500),
    IE_400("Database error", 400),
    IE_413("Product name validation error", 413),
    IE_415("Product price validation error", 415);

    private String description;
    private int statusCode;

    ErrorCode(String description, int statusCode) {
        this.description = description;
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
