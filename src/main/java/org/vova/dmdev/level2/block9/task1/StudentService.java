package org.vova.dmdev.level2.block9.task1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentService {

    //Что метод делает по смыслу:
    //
    //Он возвращает Map<Integer, Double>:
    //
    //key = номер курса (course)
    //
    //value = средняя оценка по курсу, но считается так:
    //
    //для каждого студента берётся его средняя оценка
    //
    //затем считается среднее этих “средних по студентам” внутри курса
    //
    //И учитываются только студенты, у которых оценок > 3.
    public static Map<Integer, Double> avgByCourse(List<Student> students) {
        return students.stream()
                //Оставляем только студентов у кого оценок строго больше 3.
                .filter(s -> s.getGrades().size() > 3)
                //Теперь мы группируем оставшихся студентов по курсу.
                //Тип key - Integer(getCourseNumber)
                .collect(Collectors.groupingBy(Student::getCourseNumber,
                        //После группировки получается структура типа:
                        //course=1 -> [S1, S2]
                        //course=2 -> [S3]

                        //Возьми студента → возьми его оценки → преврати в поток чисел → посчитай среднее → если оценок нет, верни 0
                        //Тип value - Double
                        Collectors.averagingDouble(s -> s.getGrades().stream()
                                //Integer → int
                                .mapToInt(Integer::intValue)
                                //Считаем среднюю всех оценок (метод IntStream)
                                .average()
                                //Если OptionalDouble(средняя оценка) пустой — возвращаем 0.0
                                .orElse(0.0)
                        )
                ));
    }

    public static Map<Integer, List<Student>> fullNamesOfStudentsByCourse(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCourseNumber));
    }
}
