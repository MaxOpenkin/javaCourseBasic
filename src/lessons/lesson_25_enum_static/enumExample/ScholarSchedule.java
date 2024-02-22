package lessons.lesson_25_enum_static.enumExample;

public class ScholarSchedule {
    private DayOfWeek day;

    private String name;


    public ScholarSchedule(DayOfWeek day) {
        this.day = day;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public String getName() {
        return name;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }
}
