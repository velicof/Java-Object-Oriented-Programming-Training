package lab1.task2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private String description;
    private List<Student> students;

    public List<Student> filterYear(int year) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getYear().equals(year)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}
