package org.vova.dmdev.level2.block9.task1;

import java.util.List;

public class Task1Runner {

    public static void main(String[] args) {
        Student student1 = new Student("Petya", "Petrov", 1, List.of(3, 4, 5));
        Student student2 = new Student("Anya", "Ivanova", 3, List.of(4, 3, 5));
        Student student3 = new Student("Sasha", "Vasyliev", 5, List.of(3, 4, 5, 5, 3, 2));
        Student student4 = new Student("Andrei", "Ivanov", 10, List.of(4, 5, 5, 2));
        Student student5 = new Student("Ivan", "Petrovich", 0, List.of(2, 3, 4, 2, 3));
        Student student6 = new Student("Ivan", "Petrovichev", 23, List.of(1, 5, 4, 5, 4, 3));

        List<Student> students = List.of(student1, student2, student3, student4, student5, student6);

        System.out.println(StudentService.avgByCourse(students));
    }
}
