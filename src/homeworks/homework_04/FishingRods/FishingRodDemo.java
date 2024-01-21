package homeworks.homework_04.FishingRods;

public class FishingRodDemo {
    public static void main(String[] args) {

        FishingRod fishingRod1 = new FishingRod("Brain", "Storm","feeder","до 70 гр.",3.6);
        fishingRod1.FishingRodData("УДИЛИЩЕ 1");

        FishingRod fishingRod2 = new FishingRod("Brain","Storm","feeder","до 90 гр.",3.6);
        fishingRod2.FishingRodData("УДИЛИЩЕ 2");

        FishingRod fishingRod3 = new FishingRod("Shimano","Catana","spinning","3-15 гр.",2.7);
        fishingRod3.FishingRodData("УДИЛИЩЕ 3");

    }
}
