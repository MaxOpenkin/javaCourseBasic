package lessons.lesson_37_pecs.practice.generics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library<T> {

    private Map<T, List<Book>> booksByGenre = new HashMap<>();

    public void addBook(Book<T> book) {
        T genre = book.getGenre();
        List<Book> books = booksByGenre.get(genre);
        if (books == null) {
            books = new ArrayList<>();
            booksByGenre.put(genre, books);
        }
        books.add(book);
    }


    public List<Book> getBooksByGenre(T genre) {
        if (booksByGenre.containsKey(genre)) {
            return booksByGenre.get(genre);
        } else {
            return new ArrayList<>();
        }
    }


}
