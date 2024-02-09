package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a Student
        Student student1 = new Student(1, "John Doe", "123 Main St", 3);

        // Accessing getter methods
        System.out.println("Student 1 ID: " + student1.getId());
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Address: " + student1.getAddress());
        System.out.println("Student 1 Grade: " + student1.getGrade());

        // Modifying by creating a new instance
        Student updatedStudent1 = new Student(student1.getId(), "John Smith", student1.getAddress(), 2);

        // Display updated information using toString
        System.out.println("Updated Student 1 Information: " + updatedStudent1);

        // Create a Teacher using the record constructor
        Teacher teacher = new Teacher(101, "Mr. Johnson", "Math");

        // Accessing getter methods for Teacher
        System.out.println("Teacher ID: " + teacher.id());
        System.out.println("Teacher Name: " + teacher.name());
        System.out.println("Teacher Subject: " + teacher.subject());

        // Create a Course with a teacher and a list of students
        Course mathCourse = new Course(1, "Mathematics 101", teacher, List.of(updatedStudent1));

        // Display information using toString
        System.out.println("Math Course Information: " + mathCourse);

        // Create an additional Student using the Builder pattern
        Student student2 = Student.builder()
                .id(2)
                .name("Jane Smith")
                .address("456 Oak St")
                .grade(95)
                .build();

        // Display information using toString for the additional Student
        System.out.println("Student 2 Information: " + student2);

        // Create an additional Course using the Builder pattern with a different teacher and student
        Course englishCourse = Course.builder()
                .id(2)
                .name("English Literature 101")
                .teacher(teacher)
                .students(List.of(student2))
                .build();

        // Display information using toString for the additional Course
        System.out.println("English Course Information: " + englishCourse);

        // Using @With to modify properties
        Student modifiedStudent1 = student1.withName("Jane Doe").withGrade(4);

        // Display updated information using toString
        System.out.println("Modified Student 1 Information: " + modifiedStudent1);
    }
}