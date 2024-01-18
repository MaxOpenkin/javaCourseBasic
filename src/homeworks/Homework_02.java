package homeworks;

public class Homework_02 {

    public static void main(String[] args) {

        // Задача 2:

        char charVariable = 'M';
        System.out.println("charVariable = " + charVariable);

        int intVariable = 888;
        System.out.println("intVariable = " + intVariable);

        byte byteVariable = 127;
        System.out.println("byteVariable = " + byteVariable);

        short shortVariable = 15064;
        System.out.println("shortVariable = " + shortVariable);

        float floatVariable = 3.53164f;
        System.out.println("floatVariable = " + floatVariable);

        double doubleVariable = 6.8247615327;
        System.out.println("doubleVariable = " + doubleVariable);

        long longVariable = 748392343272624L;
        System.out.println("longVariable = " + longVariable);

        // Задача 3:

        int x = 678;

        int digit1 = x / 100;
        int digit2 = (x % 100) / 10;
        int digit3 = x % 10;

        System.out.println("Число " + x + " -> " + digit1 + ", " + digit2 + ", " + digit3);


        int y = 345;

        int d1 = y / 100;
        int d2 = (y - d1 * 100) / 10;
        int d3 = y - d1 * 100 - d2 * 10;

        System.out.println("Число " + y + " -> " + d1 + ", " + d2 + ", " + d3);

    }
}
