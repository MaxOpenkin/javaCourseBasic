package homeworks.projects_2.carDealer;

public class Car {

    // Создать класс Car с информацией о марке, модели, годе выпуска, цене и рейтинге автомобиля.

    private String producer;
    private String model;
    private int year;
    private double price;
    private double rating;


    public Car(String producer, String model, int year, double price, double rating) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.price = price;
        this.rating = rating;
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

}
