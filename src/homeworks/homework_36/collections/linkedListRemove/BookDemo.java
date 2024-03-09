package homeworks.homework_36.collections.linkedListRemove;

import java.util.LinkedList;

public class BookDemo {

    public static void main(String[] args) {

        LinkedList<Book> books = new LinkedList<>();

        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        books.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997));
        books.add(new Book("The Da Vinci Code", "Dan Brown", 2003));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));

        System.out.println("Список книг: " + books);

        books.removeIf(book -> book.getYear() < 2000);

        System.out.println("Книги, изданные после 2000 года:");
        for (Book book : books){
            System.out.println(book);
        }
    }
}
