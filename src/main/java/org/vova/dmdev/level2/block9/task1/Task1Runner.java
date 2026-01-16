package org.vova.dmdev.level2.block9.task1;

import java.util.List;

/**
 * Задание 1
 *
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 *
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 *
 * 1)Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 *
 * 2)Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 *
 * 3)Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 *
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */

public class Task1Runner {

    public static void main(String[] args) {
        Student student1 = new Student("Petya", "Petrov", 1, List.of(3, 4, 5));
        Student student2 = new Student("Anya", "Ivanova", 3, List.of(4, 3, 5));
        Student student3 = new Student("Sasha", "Vasyliev", 5, List.of(3, 4, 5, 5, 3, 2));
        Student student4 = new Student("Andrei", "Ivanov", 10, List.of(4, 5, 5, 2));
        Student student5 = new Student("Ivan", "Petrovich", 10, List.of(2, 3, 4, 2, 3));
        Student student6 = new Student("Ivan", "Petrovichev", 23, List.of(1, 5, 4, 5, 4, 3));

        List<Student> students = List.of(student1, student2, student3, student4, student5, student6);

        System.out.println(StudentService.avgByCourse(students));
        System.out.println(StudentService.fullNamesOfStudentsByCourse(students));
    }
}
