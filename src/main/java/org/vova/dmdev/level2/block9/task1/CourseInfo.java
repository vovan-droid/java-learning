package org.vova.dmdev.level2.block9.task1;

import java.util.List;

public class CourseInfo {
    private final List<String> sortedStudents;
    private final double averageGrade;

    public CourseInfo(List<String> sortedStudents, double averageGrade) {
        this.sortedStudents = sortedStudents;
        this.averageGrade = averageGrade;
    }

    public List<String> getSortedStudents() {
        return sortedStudents;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "CourseInfo{" +
                "sortedStudents=" + sortedStudents +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
