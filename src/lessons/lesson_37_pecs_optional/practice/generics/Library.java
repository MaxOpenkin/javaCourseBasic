package lessons.lesson_37_pecs_optional.practice.generics;


import java.util.*;

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


    public Optional<Book<T>> findBookByTitle(String title) {
        for (List<Book> books : booksByGenre.values()) {
            for (Book<T> book : books) {
                if (book.getTitle().equals(title)) {
                    return Optional.of(book);
                }
            }
        }
        return Optional.empty();
    }


}
