package lessons.lesson_37_pecs.practice.generics;

public class LibraryDemo {
    public static void main(String[] args) {

    Library<String> library = new Library<>();


        library.addBook(new Book<>("Война и мир", "Классика"));
        library.addBook(new Book<>("Преступление и наказание", "Классика"));
        library.addBook(new Book<>("Анна Каренина", "Классика"));
        library.addBook(new Book<>("Ревизор", "Комедия"));
        library.addBook(new Book<>("Мертвые души", "Комедия"));


        System.out.println("Классика:");
        for (Book<String> book : library.getBooksByGenre("Классика")) {
            System.out.println(book.getTitle());
        }

        System.out.println(" ");

        System.out.println("Комедия:");
        for (Book<String> book : library.getBooksByGenre("Комедия")) {
            System.out.println(book.getTitle());
        }

    }
}
