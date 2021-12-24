package Lesson9_JC;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    interface Student {
        String getName();
        List<Course> getAllCourses();
    }

    interface Course {
        String courseName();
    }

    /*1*/

    List<String> uniqCourses(List<Student> students) {
        return students.stream()
                .map(Student::getAllCourses)
                .flatMap(List::stream)
                .map(Course::courseName)
                .distinct()
                .collect(Collectors.toList());

    }

    /*2*/


    List<Student> topStudents (List<Student> students) {
        return students.stream()
                .sorted((s1, s2) -> (s2.getAllCourses().size()) - (s1.getAllCourses().size()))
                .limit(3)
                .collect(Collectors.toList());
    }


    /*3*/

    List<Student> getStudentsFromCourses(List<Student> students, Course course) {
        return students.stream()
                .filter(student -> student.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }

    }

