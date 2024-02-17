package lessons.lesson_24_arrays.arrayWithInterfaces;

abstract class LibraryItem {
    private String title;
    private int year;

    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}