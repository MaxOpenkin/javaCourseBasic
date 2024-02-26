package lessons.lesson_30_treeSet_compareSort.compareObjects.comparable;

import java.util.Set;
import java.util.TreeSet;

public class BookDemo {

    public static void main(String[] args) {

        Set<Book> books = new TreeSet<>();

        books.add(new Book(1, "Книга художника"));
        books.add(new Book(3, "Психология"));
        books.add(new Book(2, "Маркетинг"));
        books.add(new Book(4, "Программирование"));
        books.add(new Book(5, "Книга о диетах"));
        books.add(new Book(6, "Как достать соседа"));


        for (Book book : books) {
            System.out.println(book);
        }


    }
}
