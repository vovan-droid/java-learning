package org.vova.dmdev.level2.block6.bonusexercise;

import java.util.List;
import java.util.Set;

public class LibraryRunner {
    /**
     * Задание 1. Библиотека (Map + порядок добавления + уникальность + топ)
     * <p>
     * Даны 2 класса:
     * <p>
     * Book: long id, String title, String author, int year, String genre, double rating
     * <p>
     * Library: одно поле — отсортированный ассоциативный массив: year -> книги этого года
     * <p>
     * Хранение:
     * <p>
     * ключ: year (нужен порядок по годам) → TreeMap<Integer, ...>
     * <p>
     * значение: книги в порядке добавления и без дублей → LinkedHashSet<Book> (или LinkedHashMap<Long, Book> внутри значения)
     * <p>
     * Добавить функционал:
     * <p>
     * добавить книгу
     * <p>
     * получить книги по году
     * <p>
     * получить книги по году и жанру
     * <p>
     * получить книги по автору
     * <p>
     * получить TOP-5 книг по рейтингу (убывание), при равенстве — по году (убывание), потом по названию
     * <p>
     * удалить книгу по id
     * <p>
     * Учесть:
     * <p>
     * книга не добавляется, если id уже есть
     * <p>
     * порядок внутри года — порядок добавления
     * <p>
     * Демо: отдельный класс с тестовыми данными.
     */

    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book(1, "Dune", "Frank Herbert", 1965, "Sci-Fi", 9.6);
        Book b2 = new Book(2, "1984", "George Orwell", 1949, "Dystopia", 9.4);
        Book b3 = new Book(3, "Animal Farm", "George Orwell", 1945, "Satire", 8.9);
        Book b4 = new Book(4, "Foundation", "Isaac Asimov", 1951, "Sci-Fi", 9.2);
        Book b5 = new Book(5, "Brave New World", "Aldous Huxley", 1932, "Dystopia", 9.1);
        Book b6 = new Book(6, "Dune Messiah", "Frank Herbert", 1969, "Sci-Fi", 8.7);

        Book b7 = new Book(7, "Alpha", "Test Author", 2020, "Test", 9.5);
        Book b8 = new Book(8, "Beta", "Test Author", 2021, "Test", 9.5);
        Book b9 = new Book(9, "Gamma", "Test Author", 2021, "Test", 9.5);



        System.out.println("ADD b1  (expect true):  " + library.addBook(b1));
        System.out.println("ADD b2  (expect true):  " + library.addBook(b2));
        System.out.println("ADD b3  (expect true):  " + library.addBook(b3));
        System.out.println("ADD b4  (expect true):  " + library.addBook(b4));
        System.out.println("ADD b5  (expect true):  " + library.addBook(b5));
        System.out.println("ADD b6  (expect true):  " + library.addBook(b6));
        System.out.println("ADD b7  (expect true):  " + library.addBook(b7));
        System.out.println("ADD b8  (expect true):  " + library.addBook(b8));
        System.out.println("ADD b9  (expect true):  " + library.addBook(b9));

        System.out.println("\n--- getBooksByYear ---");
        Set<Book> y2021 = library.getBooksByYear(2021);
        System.out.println("Books 2021 (expect [b8, b9] in insertion order): " + y2021);


        System.out.println("\n--- getBooksByYearAndGenre ---");
        Set<Book> test = library.getBooksByYearAndGenre(2021, "Test");
        System.out.println(test);


        System.out.println("\n--- getBooksByAuthor ---");
        Set<Book> orwell = library.getBooksByAuthor("George Orwell");
        System.out.println("George Orwell (expect [b2, b3] in insertion order across years): " + orwell);

        System.out.println("\n--- TOP-5 by rating ---");
        List<Book> top5 = library.getTop5BooksByRating();
        System.out.println("Top-5 (expect rating DESC; on 9.5 year 2021 before 2020; titles ASC within same year):");
        for (int i = 0; i < top5.size(); i++) {
            System.out.println((i + 1) + ") " + top5.get(i));
        }

        System.out.println("\n--- sanity checks (manual) ---");
        System.out.println("Top-5 should start with b1 (9.6) then 9.5 group (2021: Alpha/Beta/Gamma order by title), then b2 (9.4) or b4 (9.2) depending on your data.");
        System.out.println("If your Top-5 differs, check comparator: rating DESC, year DESC, title ASC.");

        System.out.println(library);
        library.removeBookById(1);
        System.out.println(library);
    }
}
