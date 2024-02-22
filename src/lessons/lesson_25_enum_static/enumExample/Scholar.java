package lessons.lesson_25_enum_static.enumExample;

public class Scholar {

    private ScholarSchedule schedule;

    private boolean goToSchool;


    public Scholar(ScholarSchedule schedule) {
        this.schedule = schedule;
    }

    public void wakeUp(){
        if (schedule.getDay() == DayOfWeek.SUNDAY) {
            System.out.println("Ура! Сегодня в школу не идем!");
        } else {
            System.out.println("Опять в школу!");
        }
    }
}
