package org.vova.dmdev.level2.block9.task1;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int courseNumber;
    private List<Integer> grades;

    public Student(String firstName, String lastName, int courseNumber, List<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseNumber = courseNumber;
        this.grades = grades;
    }

    public boolean hasMoreThan3Grades() {
        return grades != null && grades.size() > 3;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", curseNumber=" + courseNumber +
                ", grades=" + grades +
                '}';
    }
}
