package homeworks.homework_04.FishingRods;

public class FishingRod {

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
}