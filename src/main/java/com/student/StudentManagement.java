
package com.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudent(int id) {
        return students.removeIf(
            student -> student.getId() == id
        );
    }

    public int getStudentCount() {
        return students.size();
    }

    public static void main(String[] args) {

        StudentManagement management =
            new StudentManagement();

        management.addStudent(
            new Student(101, "Rahul", "Computer Science", 85)
        );

        management.addStudent(
            new Student(102, "Priya", "Information Technology", 90)
        );

        management.addStudent(
            new Student(103, "Amit", "Electronics", 78)
        );

        System.out.println("\n--- Student Records ---");
        management.displayStudents();

        System.out.println("\n--- Search Student ---");
        Student result = management.searchStudent(102);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\n--- Delete Student ---");
        management.deleteStudent(103);

        management.displayStudents();
    }
}
