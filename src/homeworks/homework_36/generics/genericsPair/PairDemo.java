package homeworks.homework_36.generics.genericsPair;

public class PairDemo {

    public static void main(String[] args) {

        Pair<String, Integer> personAgePair = new Pair<>("John Wick", 38);
        System.out.println("Name: " + personAgePair.getFirst());
        System.out.println("Age: " + personAgePair.getSecond());

        Pair<Double, Double> coordinates = new Pair<>(-75.343, 39.984);
        System.out.println("Longitude: " + coordinates.getFirst());
        System.out.println("Latitude: " + coordinates.getSecond());

    }

}
