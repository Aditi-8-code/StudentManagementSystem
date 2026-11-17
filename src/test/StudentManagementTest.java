
package com.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentManagementTest {

    @Test
    public void testAddStudent() {
        StudentManagement management =
            new StudentManagement();

        Student student =
            new Student(101, "Rahul", "Computer Science", 85);

        management.addStudent(student);

        assertEquals(1, management.getStudentCount());
    }

    @Test
    public void testSearchStudent() {
        StudentManagement management =
            new StudentManagement();

        management.addStudent(
            new Student(102, "Priya", "IT", 90)
        );

        assertNotNull(management.searchStudent(102));
        assertNull(management.searchStudent(999));
    }

    @Test
    public void testDeleteStudent() {
        StudentManagement management =
            new StudentManagement();

        management.addStudent(
            new Student(103, "Amit", "ECE", 78)
        );

        assertTrue(management.deleteStudent(103));
        assertEquals(0, management.getStudentCount());
    }
}
