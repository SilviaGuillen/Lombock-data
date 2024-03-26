package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating students
        Student student1 = new Student(1, "Anna", "Hamburg", 'A');
        Student student2 = new Student(2, "Ben", "456 Elm St", 'B');

        // Creating teacher
        Teacher teacher = new Teacher(1, "Herr. Smith", "Mathe");

        // Creating course
        Course course = Course.builder()
                .id(1)
                .name("Mathe")
                .teacher(teacher)
                .students(Arrays.asList(student1, student2))
                .build();

        // Testing Lombok methods
        System.out.println("Course Name: " + course.getName());
        System.out.println("Teacher Name: " + course.getTeacher().getName());
        System.out.println("Students: " + course.getStudents());

        // Using Builder pattern to create additional objects
        Student student3 = Student.builder()
                .id(3)
                .name("Carla")
                .address("Bremen")
                .grade('B')
                .build();

        System.out.println("New Student: " + student3);

        // Using With annotation to change properties
        Student updatedStudent = (Student) student1.withName("Anette");
        System.out.println("Updated Student: " + updatedStudent);
    }
}









