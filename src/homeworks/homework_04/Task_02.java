package homeworks.homework_04;

class Task_02 {
    public static void main(String[] args) {

        int num = 0, num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5, num6 = 6, num7 = 7, num8 = 8, num9 = 9;

        int sum = num + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;
        int average = sum / 10;

        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Программа отбросила в дробной части: " + (sum % 10));
    }
}
