package lessons.lesson_25_enum_static.enumExample2;

public class HolidayReminder {
    public void printHolidays(Month month){
        switch (month){
            case JANUARY :
                System.out.println("Рождество");
                break;
        }
    }
}
