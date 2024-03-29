package homeworks.projects_2.carDealer;

public class CarDealerApp {

    public static void main(String[] args) {

        CarDealer dealer = new CarDealer();

        // Измерение времени на создание автомобилей
        long startCreationTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            String vin = "VIN" + i;
            Car car = new Car("Brand" + i, "Model" + i, 2000 + (i % 20), 20000 + (i * 10), 4.0 + (i % 5) * 0.1);
            dealer.addCar(vin, car);
        }
        long endCreationTime = System.nanoTime();
        long creationDuration = (endCreationTime - startCreationTime) / 1_000_000;

        // Измерение времени выполнения методов
        long startMethodTime = System.nanoTime();

        // Примеры вызова методов
        //dealer.carsSortedByRating();
        dealer.carsSortedByPriceAscending();
        //dealer.carsSortedByYearDescending();

        long endMethodTime = System.nanoTime();
        long methodDuration = (endMethodTime - startMethodTime) / 1_000_000;
        System.out.println("Время создания 1000000 автомобилей: " + creationDuration + " мс");
        System.out.println("Время выполнения методов: " + methodDuration + " мс");
    }

}
