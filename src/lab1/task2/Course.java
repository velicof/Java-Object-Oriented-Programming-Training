package lab1.task2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private String description;
    private List<Student> students;

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
        students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

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
