package org.vova.dmdev.level2.block6and7.bonusexercise;

import java.util.*;

public class Library {
    private static Map<Integer, LinkedHashSet<Book>> library = new TreeMap<>();

    public Library() {
    }

    public static boolean addBook(Book book) {
        int year = book.getYear();

        library.putIfAbsent(year, new LinkedHashSet<>());

        LinkedHashSet<Book> books = library.get(year);

        return books.add(book);
    }

    public static LinkedHashSet<Book> getBooksByYear (int year) {
        return library.getOrDefault(year, new LinkedHashSet<>());
    }

    public static LinkedHashSet<Book> getBooksByYearAndGenre (int year, String genre) {
        LinkedHashSet<Book> result = new LinkedHashSet<>();
        LinkedHashSet<Book> booksByYear = library.get(year);
        if (booksByYear != null) {
            return result;
        }
        for (Book book : booksByYear) {
            if (genre != null && genre.equals(book.getGenre())) {
                result.add(book);
            }
        }
        return result;
    }

    public static LinkedHashSet<Book> getBooksByAuthor (String author) {
        LinkedHashSet<Book> result = new LinkedHashSet<>();
        for (LinkedHashSet<Book> books : library.values()) {
            for (Book book : books) {
                if (author != null && author.equals(book.getAuthor())) {
                    result.add(book);
                }
            }
        }
        return result;
    }

    public static List<Book> getTop5BooksByRating () {
        List<Book> allBooks = new ArrayList<>();
        for (LinkedHashSet<Book> books : library.values()) {
            allBooks.addAll(books);
        }
        Collections.sort(allBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getRating() != o2.getRating()) {
                    return Double.compare(o1.getRating(), o2.getRating()) * -1;
                }
                if (o1.getYear() != o2.getYear()) {
                    return Integer.compare(o1.getYear(), o2.getYear()) * -1;
                }
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        List<Book> result = new ArrayList<>();
        int limit = Math.min(allBooks.size(), 5);
        for (int i = 0; i < limit; i++) {
            result.add(allBooks.get(i));
        }
        return result;
    }

    public static boolean removeBookById (long id) {
        for (Map.Entry<Integer, LinkedHashSet<Book>> entry : library.entrySet()) {
            LinkedHashSet<Book> books = entry.getValue();
            Iterator<Book> it = books.iterator();
            while (it.hasNext()) {
                Book b = it.next();
                if (b.getId() == id) {
                    it.remove();

                    if (books.isEmpty()) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Library{ " + library +
                "}";
    }
}
