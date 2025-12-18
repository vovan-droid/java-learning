package org.vova.dmdev.level2.block6.exercise5.task2;

import java.util.Iterator;
import java.util.List;

public final class StudentUtil {

    private StudentUtil() {
    }

    public static Student findBestStudent(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        Student best = iterator.next();
        while (iterator.hasNext()) {
            Student current = iterator.next();
            if (current.getAverageGrade() > best.getAverageGrade()) {
                best = current;
            }
        }
        return best;
    }
}
