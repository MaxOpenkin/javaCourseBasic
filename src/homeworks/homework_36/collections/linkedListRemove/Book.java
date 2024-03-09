package homeworks.homework_36.collections.linkedListRemove;

public class Book {

//    Создать класс Book со свойствами title, author и year (год издания),
//    затем создать список LinkedList, заполнить
//    его несколькими объектами Book и удалить из списка все книги,
//    которые были изданы до 2000 года.

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
