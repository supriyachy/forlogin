package view;

import controller.StudentController;
import models.Student;

public class StudentView {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Prasanna", 20, "Chitwan", 364548);
        StudentController sc = new StudentController();
        int insertedStudent = sc.insertStudent(s1);

        if (insertedStudent > 0) {
            System.out.println("Student inserted");
        } else {
            System.out.println("Failed to insert student");
        }
    }
}