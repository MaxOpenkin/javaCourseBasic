package addMaterials.extraHomework.addHomework3.discount;

public class Product {

    private String name;
    private double regularPrice;
    private double discount;


    public Product(String name) {
        this.name = name;
    }

    public double actualPrice(){
        return regularPrice - (regularPrice * discount / 100);
    }

    public void printInformation() {
        System.out.println("Товар " + getName() + " стоимостью " + getRegularPrice() + " EUR, с учетом скидки " + getDiscount() + "% стоит: " + actualPrice() + " EUR");
    }

    public String getName() {
        return name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getDiscount() {
        return discount;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
