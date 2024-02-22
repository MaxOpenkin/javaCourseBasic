package lessons.lesson_25_enum_static.enumExample;

public class DayOfWeekByClass {
    private String day;

    public DayOfWeekByClass(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "DayOfWeekByClass{" +
                "day='" + day + '\'' +
                '}';
    }
}
