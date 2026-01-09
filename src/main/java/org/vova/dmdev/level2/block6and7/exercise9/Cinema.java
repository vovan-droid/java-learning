package org.vova.dmdev.level2.block6and7.exercise9;

import java.util.*;

public class Cinema {
    private static Map<Integer, List<Film>> filmsByYear = new TreeMap<>();

    public Cinema() {
    }

    public static boolean addNewFilm(Film film) {
        for (List<Film> films : filmsByYear.values()) {
            for (Film existing : films) {
                if (existing.equals(film)) {
                    return false;
                }
            }
        }
        int year = film.getYear();
        List<Film> filmsOfYear = filmsByYear.get(year);

        if (filmsOfYear == null) {
            filmsOfYear = new ArrayList<>();
            filmsByYear.put(year, filmsOfYear);
        }

        filmsOfYear.add(film);
        return true;
    }

    public static List<Film> getFilmsByYear(int year) {
        List<Film> filmsOfYear = filmsByYear.get(year);
        if (filmsOfYear == null) {
            return List.of();
        }
        return new ArrayList<>(filmsOfYear);
    }

    public static List<Film> getFilmsByYearAndMonth(int year, int month) {
        List<Film> filmsOfYear = filmsByYear.get(year);
        if (filmsOfYear == null) {
            return List.of();
        }
        List<Film> result = new ArrayList<>();
        for (Film film : filmsOfYear) {
            if (film.getMonth() == month) {
                result.add(film);
            }
        }
        return result;
    }

    public static List<Film> getFilmsByGenre(Genre genre) {
        List<Film> result = new ArrayList<>();
        for (List<Film> films : filmsByYear.values()) {
            for (Film film : films) {
                if (film.getGenre() == genre) {
                    result.add(film);
                }
            }
        }
        return result;
    }

    public static List<Film> getTop10FilmsByRating() {
        List<Film> allFilms = new ArrayList<>();
        for (List<Film> films : filmsByYear.values()) {
            allFilms.addAll(films);
        }
        Collections.sort(allFilms, new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                return Double.compare(f1.getRating(), f2.getRating()) * -1;
            }
        });
        List<Film> result = new ArrayList<>();
        int limit = Math.min(allFilms.size(), 10);
        for (int i = 0; i < limit; i++) {
            result.add(allFilms.get(i));
        }
        return result;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "filmsByYear=" + filmsByYear +
                "}";
    }
}
