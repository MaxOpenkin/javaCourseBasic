package lessons.lesson_25_enum_static.enumExample2;

import java.util.Arrays;

public class MonthDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(MonthWithDays.values()));

        System.out.println();

        System.out.println(Arrays.toString(MonthWithDays.getSummerMonths()));
    }
}
