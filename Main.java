// File: Main.java
import java.util.*;

class Course {
    String courseName;
    int marks;

    Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }
}

class Student {
    String name;
    String program;
    int semester;
    List<Course> courses;

    Student(String name, String program, int semester, List<Course> courses) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = courses;
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 1: Creating students with course details
        List<Course> courses1 = Arrays.asList(
            new Course("Math", 35),
            new Course("Physics", 55)
        );

        List<Course> courses2 = Arrays.asList(
            new Course("Biology", 38),
            new Course("Chemistry", 75)
        );

        List<Course> courses3 = Arrays.asList(
            new Course("Programming", 90),
            new Course("Data Structures", 32)
        );

        List<Student> students = Arrays.asList(
            new Student("Alice", "B.Tech", 4, courses1),
            new Student("Bob", "B.Sc", 3, courses2),
            new Student("Charlie", "BCA", 2, courses3)
        );

        // Step 1: Retrieve student info
        System.out.println("Student Information:\n");
        for (Student s : students) {
            System.out.println("Name: " + s.name);
            System.out.println("Program: " + s.program);
            System.out.println("Semester: " + s.semester);
            System.out.println("Courses Registered:");
            for (Course c : s.courses) {
                System.out.println(" - " + c.courseName);
            }
            System.out.println();
        }

        // Step 2: Students with marks < 40
        System.out.println("Students who scored less than 40:\n");
        for (Student s : students) {
            System.out.println("Name: " + s.name);
            for (Course c : s.courses) {
                if (c.marks < 40) {
                    System.out.println(" -> " + c.courseName + ": " + c.marks);
                }
            }
            System.out.println();
        }
    }
}
