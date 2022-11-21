package com.company;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Teacher> teachers=new ArrayList<>();
    private List<Student> students=new ArrayList<>();
    private static int totalMoneyEraned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEraned=0;
        totalMoneySpent=0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEraned() {
        return totalMoneyEraned;
    }

    public static void updateTotalMoneyEraned(int total) {
        totalMoneyEraned += total;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(int totalMoneySpent) {
        Teacher t = null;
        this.totalMoneySpent+=t.getSalary();
    }
}
