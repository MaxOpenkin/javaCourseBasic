package homeworks.homework_04.FishingRods;

class FishingRod {

    String brand;
    String name;
    String type;
    String test;
    double length;

    public FishingRod(String b, String n, String t, String test, double length) {
        brand = b;
        name = n;
        type = t;
        this.test = test;
        this.length = length;
    }

    public void FishingRodData(String textMessage) {
        System.out.println(textMessage);
        System.out.println();
        System.out.println("Характеристики удочки: ");
        System.out.println();
        System.out.println("Производитель - " + brand);
        System.out.println("Модель - " + name);
        System.out.println("Направление, вид удилища - " + type);
        System.out.println("Тест удилища - " + test);
        System.out.println("Длина удилища - " + length);
        System.out.println("===================================");
        System.out.println();
    }

    static class FishingRodDemo {
        public static void main(String[] args) {

            FishingRod fishingRod1 = new FishingRod("Brain", "Storm", "feeder", "до 70 гр.", 3.6);
            fishingRod1.FishingRodData("УДИЛИЩЕ 1");

            FishingRod fishingRod2 = new FishingRod("Brain", "Storm", "feeder", "до 90 гр.", 3.6);
            fishingRod2.FishingRodData("УДИЛИЩЕ 2");

            FishingRod fishingRod3 = new FishingRod("Shimano", "Catana", "spinning", "3-15 гр.", 2.7);
            fishingRod3.FishingRodData("УДИЛИЩЕ 3");

        }
    }
}