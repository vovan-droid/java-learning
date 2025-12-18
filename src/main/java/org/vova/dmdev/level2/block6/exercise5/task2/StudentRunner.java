package org.vova.dmdev.level2.block6.exercise5.task2;

import java.util.*;

/**
 * 2. Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и
 * среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с
 * самым высоким средним баллом используя итератор.
 * Отсортировать и вывести список учеников по полному имени
 * (имя + фамилия), возрасту и среднему баллу, используя
 * компараторы.
 */

public class StudentRunner {

    public static void main(String[] args) {
        Student petr = new Student("Petr", "Agutin", 11, 3.3);
        Student sveta = new Student("Sveta", "Svetikova", 13, 5.0);
        Student ivan = new Student("Ivan", "Ivanov", 12, 2.1);
        List<Student> list = new ArrayList<>(Arrays.asList(petr, sveta, ivan));

        Student best = StudentUtil.findBestStudent(list);
        System.out.println(best);
        System.out.println();

        System.out.println(list);
        System.out.println();

        Comparator<Student> byFullName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getName().compareTo(o2.getName());
                if (result == 0) {
                    return result;
                }
                return o1.getSurname().compareTo(o2.getSurname());
            }
        };

        Collections.sort(list, byFullName);
        System.out.println(list);
        System.out.println();

        Comparator<Student> byAge = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Collections.sort(list, byAge);
        System.out.println(list);
        System.out.println();

        Comparator<Student> byAverageGrade = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getAverageGrade(), s2.getAverageGrade());
            }
        };

        Collections.sort(list, byAverageGrade);
        System.out.println(list);
        System.out.println();
    }
}
