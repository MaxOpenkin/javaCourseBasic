package lessons.lesson_25_enum_static.enumExample;

public class Diet {
    public void takeLunch(DayOfWeek day) {
        switch (day) {
            case SUNDAY :
                System.out.println(day.getTitle());
                System.out.println("Воскресный обед! Можно немного сладкого!");
                break;
            case MONDAY:
                System.out.println("Куриная лапша");
                break;
                // ...
        }
    }
}
