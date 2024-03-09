package homeworks.homework_36.collections.linkedHashMapTime;

import java.util.Objects;

public class Time implements Comparable<Time> {

    // Создать отображение LinkedHashMap, где ключом является объект Time (время), а значением - список строк.
    //        Затем добавить несколько строк в список для каждого времени
    //        и вывести все элементы отображения на консоль в порядке возрастания времени.

    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public int compareTo(Time other) {
        if (this.hour != other.hour) {
            return Integer.compare(this.hour, other.hour);
        } else {
            return Integer.compare(this.minute, other.minute);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour && minute == time.minute;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

}
