package consultations.cons_15.practice;

public class Request {
    private String message;
    private int number;

    public Request(String message, int number) {
        this.message = message;
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Request{" +
                "message='" + message + '\'' +
                ", number=" + number +
                '}';
    }
}
