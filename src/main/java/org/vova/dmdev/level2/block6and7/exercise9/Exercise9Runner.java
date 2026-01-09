package org.vova.dmdev.level2.block6and7.exercise9;

public class Exercise9Runner {

    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        Film f1 = new Film(1, 2020, 1, Genre.DRAMA, 8.1);
        Film f2 = new Film(2, 2020, 1, Genre.ACTION, 7.2);
        Film f3 = new Film(3, 2020, 2, Genre.DRAMA, 9.0);
        Film f4 = new Film(4, 2020, 2, Genre.COMEDY, 6.5);

        Film f5 = new Film(5, 2021, 5, Genre.DRAMA, 9.5);
        Film f6 = new Film(6, 2021, 5, Genre.ACTION, 8.9);
        Film f7 = new Film(7, 2021, 6, Genre.ACTION, 8.0);

        Film f8 = new Film(8, 2022, 3, Genre.DRAMA, 9.7);
        Film f9 = new Film(9, 2022, 3, Genre.DRAMA, 9.6);
        Film f10 = new Film(10, 2022, 3, Genre.COMEDY, 9.5);
        Film f11 = new Film(11, 2022, 4, Genre.ACTION, 9.3);
        Film f12 = new Film(12, 2022, 4, Genre.ACTION, 9.2);
        Film f13 = new Film(13, 2022, 4, Genre.ACTION, 9.1);
        Film f14 = new Film(14, 2022, 7, Genre.COMEDY, 9.0);
        Film f15 = new Film(15, 2022, 7, Genre.COMEDY, 8.8);
        Film f16 = new Film(16, 2022, 7, Genre.COMEDY, 8.7);
        Film f17 = new Film(17, 2022, 7, Genre.COMEDY, 8.6);
        Film f18 = new Film(18, 2022, 8, Genre.HORROR, 8.5);

        cinema.addNewFilm(f1);
        cinema.addNewFilm(f2);
        cinema.addNewFilm(f3);
        cinema.addNewFilm(f4);
        cinema.addNewFilm(f5);
        cinema.addNewFilm(f6);
        cinema.addNewFilm(f7);
        cinema.addNewFilm(f8);
        cinema.addNewFilm(f9);
        cinema.addNewFilm(f10);
        cinema.addNewFilm(f11);
        cinema.addNewFilm(f12);
        cinema.addNewFilm(f13);
        cinema.addNewFilm(f14);
        cinema.addNewFilm(f15);
        cinema.addNewFilm(f16);
        cinema.addNewFilm(f17);
        cinema.addNewFilm(f18);

        System.out.println(cinema);

        System.out.println(cinema.getFilmsByGenre(Genre.DRAMA));

        System.out.println(cinema.getFilmsByYear(2020));

        System.out.println(cinema.getFilmsByYearAndMonth(2020, 1));

        System.out.println(cinema.getTop10FilmsByRating());
    }
}
