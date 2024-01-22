package homeworks.homework_04;

class Task_03 {
    public static void main(String[] args) {

        int priceA = 1000;
        int priceB = 500;

        int discount = 100;

        int totalCost = (priceA + priceB) - discount;

        System.out.println("Сумма покупки со скидкой: " + totalCost);
        System.out.println("Сумма скидки: " + discount);
    }
}
