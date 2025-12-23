package org.vova.dmdev.level2.block6.exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Cinema {
    private static Map<Integer, List<Film>> filmsByYear = new TreeMap<>();

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
}
