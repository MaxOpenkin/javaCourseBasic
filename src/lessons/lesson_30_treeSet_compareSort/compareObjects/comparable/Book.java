package lessons.lesson_30_treeSet_compareSort.compareObjects.comparable;

public class Book implements Comparable<Book> {

    private int id;
    private String nameBook;

    public Book(int id, String nameBook) {
        this.id = id;
        this.nameBook = nameBook;
    }

    public int getId() {
        return id;
    }

    public String getNameBook() {
        return nameBook;
    }


    @Override
    public int compareTo(Book other) {
        int idCompare = Integer.compare(this.id, other.id);
        if (idCompare == 0) {
            return this.nameBook.compareTo(other.nameBook);
        }
        return idCompare;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                '}';
    }

}
