package lessons.lesson_25_enum_static.enumExample;

public class DayOfWeekOld {

    private String day;

    private DayOfWeekOld(String day) {
        this.day = day;
    }

    public static DayOfWeekOld SUNDAY = new DayOfWeekOld("Воскресенье");
    public static DayOfWeekOld MONDAY = new DayOfWeekOld("Понедельник");
    public static DayOfWeekOld TUESDAY = new DayOfWeekOld("Вторник");
    public static DayOfWeekOld WEDNESDAY = new DayOfWeekOld("Среда");
    public static DayOfWeekOld THURSDAY = new DayOfWeekOld("Четверг");
    public static DayOfWeekOld FRIDAY = new DayOfWeekOld("Пятница");
    public static DayOfWeekOld SATURDAY = new DayOfWeekOld("Суббота");


    @Override
    public String toString() {
        return "DayOfWeekOld{" +
                "day='" + day + '\'' +
                '}';
    }
}
