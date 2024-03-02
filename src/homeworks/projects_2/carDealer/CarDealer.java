package homeworks.projects_2.carDealer;

import java.util.*;

public class CarDealer {

private Map<String, Car> cars;

    public CarDealer() {
        this.cars = new HashMap<>();
    }


    public void addCar(String vin, Car car) {
        if (cars.containsKey(vin)) {
            System.out.println("Ошибка: Автомобиль с VIN " + vin + " уже существует.");
        } else {
            cars.put(vin, car);
            System.out.println("Автомобиль добавлен: " + car);
        }
    }


    public void removeCar(String vin) {
        if (!cars.containsKey(vin)) {
            System.out.println("Ошибка: Автомобиль с VIN " + vin + " не найден.");
        } else {
            cars.remove(vin);
            System.out.println("Автомобиль с VIN " + vin + " удален.");
        }
    }


    public void changeCarPrice(String vin, double newPrice){
        Car car = cars.get(vin);
        if (car == null) {
            System.out.println("Ошибка: Автомобиль с VIN " + vin + " не найден.");
        } else {
            car.setPrice(newPrice);
            System.out.println("Цена автомобиля с VIN " + vin + " обновлена: " + newPrice);
        }
    }


    public void findCarsByProducer(String producer) {
        List<Car> carsByProducer = new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getProducer().equalsIgnoreCase(producer)) {
                carsByProducer.add(car);
            }
        }
        if (carsByProducer.isEmpty()) {
            System.out.println("Автомобили марки " + producer + " не найдены.");
        } else {
            System.out.println("Найденные автомобили марки " + producer + ":");
            for (Car car : carsByProducer) {
                System.out.println(car);
            }
        }
    }


    public void findCarsByModel(String model) {
        List<Car> carsByModel = new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getModel().equalsIgnoreCase(model)) {
                carsByModel.add(car);
            }
        }
        if (carsByModel.isEmpty()) {
            System.out.println("Автомобили модели " + model + " не найдены.");
        } else {
            System.out.println("Найденные автомобили модели " + model + ":");
            for (Car car : carsByModel) {
                System.out.println(car);
            }
        }
    }


    public void findCarsByYear(int year) {
        List<Car> carsByYear = new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getYear() == year) {
                carsByYear.add(car);
            }
        }
        if (carsByYear.isEmpty()) {
            System.out.println("Автомобили года выпуска " + year + " не найдены.");
        } else {
            System.out.println("Найденные автомобили года выпуска " + year + ":");
            for (Car car : carsByYear) {
                System.out.println(car);
            }
        }
    }


    public void findCarsByPrice(double price) {
        List<Car> carsByPrice = new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getPrice() == price) {
                carsByPrice.add(car);
            }
        }
        if (carsByPrice.isEmpty()) {
            System.out.println("Автомобили с ценой " + price + " не найдены.");
        } else {
            System.out.println("Найденные автомобили с ценой " + price + ":");
            for (Car car : carsByPrice) {
                System.out.println(car);
            }
        }
    }


    public void carsSortedByRating() {
        List<Car> sortedCars = new ArrayList<>(cars.values());
        sortedCars.sort(new CarRatingComparator());

        System.out.println("Автомобили, отсортированные по рейтингу:");
        for (Car car : sortedCars) {
            System.out.println(car);
        }
    }


    public void carsSortedByPriceAscending() {
        List<Car> sortedCars = new ArrayList<>(cars.values());
        sortedCars.sort(new CarPriceComparator(true));

        System.out.println("Автомобили, отсортированные по цене (по возрастанию):");
        for (Car car : sortedCars) {
            System.out.println(car);
        }
    }

    public void carsSortedByPriceDescending() {
        List<Car> sortedCars = new ArrayList<>(cars.values());
        sortedCars.sort(new CarPriceComparator(false));

        System.out.println("Автомобили, отсортированные по цене (по убыванию):");
        for (Car car : sortedCars) {
            System.out.println(car);
        }
    }


    public void carsSortedByYearAscending() {
        List<Car> sortedCars = new ArrayList<>(cars.values());
        sortedCars.sort(new CarYearComparator(true)); // Сортировка по возрастанию года выпуска

        System.out.println("Автомобили, отсортированные по году выпуска (по возрастанию):");
        for (Car car : sortedCars) {
            System.out.println(car);
        }
    }

    public void carsSortedByYearDescending() {
        List<Car> sortedCars = new ArrayList<>(cars.values());
        sortedCars.sort(new CarYearComparator(false)); // Сортировка по убыванию года выпуска

        System.out.println("Автомобили, отсортированные по году выпуска (по убыванию):");
        for (Car car : sortedCars) {
            System.out.println(car);
        }
    }


    public void printAllCars() {
        if (cars.isEmpty()) {
            System.out.println("В автосалоне нет доступных автомобилей.");
        } else {
            System.out.println("Все доступные автомобили:");
            for (Car car : cars.values()) {
                System.out.println(car);
            }
        }
    }


}
